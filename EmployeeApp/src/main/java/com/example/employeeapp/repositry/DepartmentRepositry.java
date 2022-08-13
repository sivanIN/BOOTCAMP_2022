package com.example.employeeapp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.employeeapp.entity.Department;

@RepositoryRestResource(path ="dep")
@CrossOrigin("http://localhost:4200/")
public interface DepartmentRepositry extends JpaRepository<Department, Integer>{

}
