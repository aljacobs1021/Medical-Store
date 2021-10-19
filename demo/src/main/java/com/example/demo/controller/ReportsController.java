//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dao.ReportsDAO;
//import com.example.demo.models.Customer;
//import com.example.demo.models.Reports;
//import com.example.demo.service.CustomerManager;
//import com.example.demo.service.ReportsService;
//
//@RestController
//@RequestMapping(path="reports")
//public class ReportsController {
//	
//	private static final Logger logger = LogManager.getLogger(ReportsController.class);
//	private ReportsService rServ;
//	
//	
//	@CrossOrigin(origins = "http://localhost:4200")
//	@GetMapping(path="/getAll", produces="application/json")
//	public ResponseEntity<List<Reports>> getAll(){
//		logger.info("Getting all reports");
//		List<Reports> reportList = rServ.findAll();
//		logger.info("Finding all reports");
//		return new ResponseEntity<List<Reports>>(reportList, HttpStatus.OK);
//	}
//}