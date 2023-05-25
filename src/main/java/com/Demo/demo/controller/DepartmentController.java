package com.Demo.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.demo.entity.Department;
import com.Demo.demo.service.DepartmentService;




@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	Logger logger = LoggerFactory.getLogger(DepartmentController.class);


	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		logger.info("inside saveDepartment of departement controller");
		return departmentService.saveDepartment(department);

	}
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList() {
		logger.info("inside fetchDepartmentList of departement controller");
		return departmentService.fetchDepartmentList(); 
	}

	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") long departmentId)  {
		logger.info("inside fetchDepartmentById of departement controller");
		return departmentService.fetchDepartmentById(departmentId);
	}

	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		logger.info("inside deleteDepartmentById of departement controller");
		return "Department deleted successfully";
	}

	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") long departmentId,@RequestBody Department department) {
		logger.info("inside updateDepartment of departement controller");
		return departmentService.updateDepartment(departmentId,department);
	}

	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		logger.info("inside fetchDepartmentByName of departement controller");
		return departmentService.fetchDepartmentByName(departmentName);
	}

}
