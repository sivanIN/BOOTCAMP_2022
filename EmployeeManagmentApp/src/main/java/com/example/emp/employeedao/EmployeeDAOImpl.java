package com.example.emp.employeedao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.emp.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Employee> findAll() {
		
		Session currentsession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentsession.createQuery("select e from Employee e",Employee.class);
		List<Employee> employees = query.getResultList();
		return employees;
	}
	
	

}
