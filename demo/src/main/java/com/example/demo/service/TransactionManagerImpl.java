package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TransactionDAO;
import com.example.demo.models.Transaction;

@Service
public class TransactionManagerImpl implements TransactionManager{
	
	@Autowired
	private TransactionDAO transactionDAO;
	
	@Override
	public List<Transaction> findAll() {
		return transactionDAO.findAll();
	}
	
	@Override
	public List<Transaction> findAllByCustomer(int id) {
		return transactionDAO.findAllByCustomer(id);
	}

}
