package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Integer>{
	
	List<Customer> findAll();

}
