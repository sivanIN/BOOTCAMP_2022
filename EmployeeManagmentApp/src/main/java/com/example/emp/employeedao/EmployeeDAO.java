package com.example.emp.employeedao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.emp.entity.Employee;

@Repository
public interface EmployeeDAO {
	
	List<Employee> findAll();

}
