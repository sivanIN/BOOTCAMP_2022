package com.example.thymeleafdatajpaempapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thymeleafdatajpaempapp.entity.Employee;
import com.example.thymeleafdatajpaempapp.service.EmployeeService;

@Controller
@RequestMapping("/App")
public class EmpAppController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/employees")
	public String displayAllEmp(Model model) {
		
		List<Employee> employee = employeeService.findAll();
		model.addAttribute("EMPLOYEE",employee);
		
		return "AppFrontend/employee.html";
		
	}
	
	@GetMapping("/showFormForAdd")
	public String empForm(Model model) {
		
		model.addAttribute("EMPLOYEE",new Employee());
		
		
		return "AppFrontend/empform.html";
		
	}
	
	
	@PostMapping("/newEmp")
	public String Save(@ModelAttribute Employee e) {
		
		employeeService.addEmployee(e);
		
		return "redirect:/App/employees";
		
		
	}
	
	@GetMapping("/showFormForUpdate")
	public String updateEmployee(@RequestParam("empid") Integer empid ,Model model) {
		
		Employee employee = employeeService.findById(empid);
		model.addAttribute("EMPLOYEE",employee);
		return "AppFrontend/empform.html";
		
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("empid") Integer empid) {
		
		employeeService.deleteById(empid);
		return "redirect:/App/employees";
		
	}

}
