package com.example.thymeleafdatajpaempapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
    
	@Id
	@Column(name = "DEPTNO")
	private Integer deptNo;
	
	@Column(name = "DNAME")
	private String depName;
	
	@Column(name = "LOC")
	private String location;
	
	
	
	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer deptNo, String depName, String location) {
		super();
		this.deptNo = deptNo;
		this.depName = depName;
		this.location = location;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", depName=" + depName + ", location=" + location + "]";
	}
	
	
	
	
}
