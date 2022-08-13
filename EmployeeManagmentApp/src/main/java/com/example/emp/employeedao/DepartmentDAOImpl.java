package com.example.emp.employeedao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.emp.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{
	
	@Autowired
	EntityManager  entitymanager;

	@Override
	public List<Department> departmentlist() {
		
		Session Currentsession = entitymanager.unwrap(Session.class);
		Query<Department> query = Currentsession.createQuery("select d from Department d",Department.class);
		List<Department> departmentlist = query.getResultList();
		
		return departmentlist;
	}

}
