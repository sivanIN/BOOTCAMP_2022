package com.example.employeeapp.repositry;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.employeeapp.entity.Employee;

@RepositoryRestResource(path ="emp")
@CrossOrigin("http://localhost:4200")

public interface EmployeeRespositry extends JpaRepository<Employee, Integer>{
	
	List<Employee> findByEnameContainsIgnoreCase(@RequestParam("ename") String ename);
	Page<Employee> findBydeptNo(@RequestParam("id") Integer id,Pageable pageable);

}
