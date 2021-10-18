package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.models.Customer;

@Service
public class CustomerManagerImpl implements CustomerManager{

	@Autowired
	private CustomerDAO custDAO;
	
	@Override
	public List<Customer> findAll() {
		return custDAO.findAll();
	}
}
