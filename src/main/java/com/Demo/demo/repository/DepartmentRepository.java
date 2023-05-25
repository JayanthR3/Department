package com.Demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Demo.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>,CrudRepository<Department, Long> {

	
	public Department findBydepartmentName(String departmentName);

	
}
