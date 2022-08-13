package com.example.thymeleafdatajpaempapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thymeleafdatajpaempapp.entity.Employee;
import com.example.thymeleafdatajpaempapp.repositry.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDAO employeeDAO;

	
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}


	@Transactional
	public void addEmployee(Employee e) {
		employeeDAO.save(e);
		
	}


	@Override
	public Employee findById(Integer empid) {
		
		Optional<Employee> p = employeeDAO.findById(empid);
		Employee emp = null;
		
		if(p.isPresent())
			emp = p.get();
		
		return emp;
			
			
	}


	@Override
	public void deleteById(Integer empid) {
		
		employeeDAO.deleteById(empid);
	}

}
