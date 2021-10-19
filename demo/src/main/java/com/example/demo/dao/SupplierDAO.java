package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Supplier;

@Repository
public interface SupplierDAO extends JpaRepository<Supplier, Integer> {

	public List<Supplier> findAll();
	public Supplier findById(int id);
	
}
