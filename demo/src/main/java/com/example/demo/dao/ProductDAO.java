package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer>{

	@EntityGraph(
		type = EntityGraphType.FETCH,
		attributePaths = {
			"supplier"
		}
			
	)
	List<Product> findAll();
}
