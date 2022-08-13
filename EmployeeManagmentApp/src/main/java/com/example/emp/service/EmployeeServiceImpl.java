package com.example.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.employeedao.EmployeeDAOImpl;
import com.example.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAOImpl employeeDAOImpl;

	@Override
	public List<Employee> employeelist() {
		// TODO Auto-generated method stub
		return employeeDAOImpl.findAll();
	}

}
