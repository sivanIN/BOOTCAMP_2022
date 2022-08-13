package com.example.thymeleafdatajpaempapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.thymeleafdatajpaempapp.entity.Employee;

@Service
public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public void addEmployee(Employee e);

	public Employee findById(Integer empid);

	public void deleteById(Integer empid);

}
