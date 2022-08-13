package com.webapllication.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapllication.webapp.service.Webservice;

@RestController
@RequestMapping("/web")
public class WebController {
	
	@Autowired
	private Webservice webservice;
	
	@GetMapping("/display")
	public String salary() {
		
		return "salary";
	}
	
	@GetMapping("/servicedisplay")
	public String  serviceSalary() {
		return webservice.display();
	}

}
