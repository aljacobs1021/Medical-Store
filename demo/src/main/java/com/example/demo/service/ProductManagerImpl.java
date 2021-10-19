package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDAO;
import com.example.demo.models.Product;

@Service
public class ProductManagerImpl implements ProductManager {

	@Autowired
	private ProductDAO prodDAO;
	
	@Override
	public List<Product> findAll() {
		return prodDAO.findAll();
	}

}
