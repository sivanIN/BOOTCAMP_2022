package com.example.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.employeedao.DepartmentDAOImpl;
import com.example.emp.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentDAOImpl departmentDAOImpl;

	@Override
	public List<Department> departmentlist() {
		
		return departmentDAOImpl.departmentlist();
	}

}
