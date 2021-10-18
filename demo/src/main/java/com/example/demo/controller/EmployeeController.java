package com.example.demo.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.service.EmployeeManager;


@RestController
@RequestMapping(path="employee")
public class EmployeeController {
	
		
	private static final Logger logger = LogManager.getLogger(EmployeeController.class);

		
	@Autowired
	private EmployeeManager employeeManager;
		
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path="/getAll", produces="application/json")
	public ResponseEntity<List<Employee>> getAll(){
		logger.info("beep");
		List<Employee> empList = employeeManager.findAll();
		logger.info("beep1");
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	}
		
		

}

