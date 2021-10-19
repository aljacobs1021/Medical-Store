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

import com.example.demo.models.Supplier;
import com.example.demo.service.SupplierManager;

@RestController
@RequestMapping(path="supplier")
public class SupplierController {

	private static final Logger logger = LogManager.getLogger(SupplierController.class);
	
	@Autowired
	private SupplierManager supplierManager;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path="/getAll", produces="application/json")
	public ResponseEntity<List<Supplier>> getAll(){
		logger.info("Getting list of all suppliers");
		List<Supplier> suppList = supplierManager.findAll();
		logger.info("Finding all suppliers");
		return new ResponseEntity<List<Supplier>>(suppList, HttpStatus.OK);
	}
}
