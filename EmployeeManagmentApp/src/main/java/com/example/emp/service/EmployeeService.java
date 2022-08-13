package com.example.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.emp.entity.Employee;


@Service
public interface EmployeeService {
	
	List<Employee> employeelist();

}
