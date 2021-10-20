package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{
	
	public List<Customer> findAll();
	public Customer findById(int id);

}
