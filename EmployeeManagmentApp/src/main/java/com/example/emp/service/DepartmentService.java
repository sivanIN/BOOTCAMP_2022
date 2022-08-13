package com.example.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.emp.entity.Department;

@Service
public interface DepartmentService {
	
	List<Department> departmentlist();

}
