package com.example.emp.employeedao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.emp.entity.Department;

@Repository
public interface DepartmentDAO {
	
	List<Department> departmentlist();

}
