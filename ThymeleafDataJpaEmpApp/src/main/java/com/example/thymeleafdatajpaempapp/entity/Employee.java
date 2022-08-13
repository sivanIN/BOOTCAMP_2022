package com.example.thymeleafdatajpaempapp.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empno")
	private Integer empno;
	
	@Column(name="ENAME")
	private String ename;
	
	@Column(name="JOB")
	private String job;
	
	@Column(name="HIREDATE")
	private Date hireDate;
	
	@Column(name="MANAGERID")
	private Integer managerId;
	
	@Column(name="SALARY")
	private Integer salary;
	
	@Column(name="commission")
	private Integer commission;
	
	@Column(name="DEPTNO")
	private Integer deptNo;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empno, String ename, String job, Date hireDate, Integer managerId, Integer salary,
			Integer commission, Integer deptNo) {
		super();
		
		this.ename = ename;
		this.job = job;
		this.hireDate = hireDate;
		this.managerId = managerId;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
		
	}
	
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getCommission() {
		return commission;
	}
	public void setCommission(Integer commission) {
		this.commission = commission;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	
	
	

}
