package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SupplierDAO;
import com.example.demo.models.Supplier;

@Service
public class SupplierManagerImpl implements SupplierManager {

	@Autowired
	private SupplierDAO suppDAO;
	
	@Override
	public List<Supplier> findAll() {
		return suppDAO.findAll();
	}

}
