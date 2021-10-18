package com.example.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.models.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
	//might need to fix	
	@Query("select p.name, p.description, p.ppu as ppu from product ps join products p on" + "ps.product_id = p.productid group by p.title")
	public List<Map<String, Object>>getDemand();
}
	
