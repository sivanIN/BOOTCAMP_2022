package com.example.emp.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp.entity.Department;
import com.example.emp.entity.Employee;
import com.example.emp.service.DepartmentService;
import com.example.emp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/showall")
	public List<Employee> findAll(){
		return employeeService.employeelist();
	}
	
	@GetMapping("/alldep")
	public List<Department> findAllDep(){
		return departmentService.departmentlist();
	}

}
