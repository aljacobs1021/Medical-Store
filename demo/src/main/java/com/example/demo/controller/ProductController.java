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

import com.example.demo.models.Product;
import com.example.demo.service.ProductManager;

@RestController
@RequestMapping(path="product")
public class ProductController {
	
	@SuppressWarnings("unused")
	private static final Logger logger = LogManager.getLogger(ProductController.class);

	@Autowired
	private ProductManager productManager;
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(path="/getAll", produces="application/json")
	public ResponseEntity<List<Product>> getAll() {
		logger.info("Getting all products");
		List<Product> prodList = productManager.findAll();
		
		return new ResponseEntity<List<Product>>(prodList, HttpStatus.OK);
	}
}
