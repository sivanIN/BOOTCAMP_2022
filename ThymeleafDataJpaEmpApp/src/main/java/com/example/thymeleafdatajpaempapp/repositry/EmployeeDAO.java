package com.example.thymeleafdatajpaempapp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thymeleafdatajpaempapp.entity.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

}
