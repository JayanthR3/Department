package com.Demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.Demo.demo.entity.Department;
import com.Demo.demo.repository.DepartmentRepository;
import com.Demo.demo.service.DepartmentService;

@SpringBootTest
public class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepository departmentRepository;
	
	
	
	@Test
	public void whenValidDepartmentName_thenDepartmentShouldFound() {
		String departmentname="it";
		Department found=departmentService.fetchDepartmentByName(departmentname);
		assertEquals(departmentname,found.getDepartmentName());
	}
	
	
}
