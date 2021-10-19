package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Transaction;

public interface TransactionManager {
	
	List<Transaction> findAll();

}
