package com.Demo.demo.service;

import java.util.List;

import org.hibernate.ObjectNotFoundException;

import com.Demo.demo.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(long departmentId);

	public void deleteDepartmentById(long departmentId);

	public Department updateDepartment(long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

	
	



}
