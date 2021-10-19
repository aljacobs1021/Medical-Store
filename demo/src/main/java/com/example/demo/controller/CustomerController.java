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

import com.example.demo.models.Customer;
import com.example.demo.service.CustomerManager;

@RestController
@RequestMapping(path="customer")
public class CustomerController {
	
	private static final Logger logger = LogManager.getLogger(CustomerController.class);

	
	@Autowired
	private CustomerManager customerManager;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path="/getAll", produces="application/json")
	public ResponseEntity<List<Customer>> getAll(){
		logger.info("Getting list of all customers");
		List<Customer> custList = customerManager.findAll();
		logger.info("Finding all customers");
		return new ResponseEntity<List<Customer>>(custList, HttpStatus.OK);
	}
	
	

}
