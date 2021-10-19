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

import com.example.demo.models.Transaction;
import com.example.demo.service.TransactionManager;

@RestController
@RequestMapping(path="transaction")
public class TransactionController {
	
	@SuppressWarnings("unused")
	private static final Logger logger = LogManager.getLogger(TransactionController.class);

	@Autowired
	private TransactionManager transactionManager;
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(path="/getAll", produces="application/json")
	public ResponseEntity<List<Transaction>> getAll() {
		List<Transaction> transList = transactionManager.findAll();
		
		return new ResponseEntity<List<Transaction>>(transList, HttpStatus.OK);
	}
}
