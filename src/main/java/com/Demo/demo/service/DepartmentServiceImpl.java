package com.Demo.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Demo.demo.entity.Department;
import com.Demo.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService  {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(long departmentId) {
		Optional<Department> department=departmentRepository.findById(departmentId);
		if(!department.isPresent()) {
			
		}
		return department.get();
	}

	@Override
	public void deleteDepartmentById(long departmentId) {
		departmentRepository.deleteById(departmentId);
		
	}

	@Override
	public Department updateDepartment(long departmentId, Department department) {
		Department depdb= departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentName())&&
		!"".equalsIgnoreCase(department.getDepartmentName())){
			depdb.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDepartmentCode())&&
				!"".equalsIgnoreCase(department.getDepartmentCode())){
					depdb.setDepartmentCode(department.getDepartmentCode());
				}
		
		if(Objects.nonNull(department.getDepartmentAddress())&&
				!"".equalsIgnoreCase(department.getDepartmentAddress())){
					depdb.setDepartmentAddress(department.getDepartmentAddress());
				}
		return departmentRepository.save(depdb);
	}

	@Override
	public Department fetchDepartmentByName(String departmentName) {
		
		return departmentRepository.findBydepartmentName(departmentName);
	}
	
	
	

}
