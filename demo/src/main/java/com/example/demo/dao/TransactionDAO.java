package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Transaction;

@Repository
public interface TransactionDAO extends JpaRepository<Transaction, Integer>{
	
	@EntityGraph(
		type = EntityGraphType.FETCH,
		attributePaths = {
				"customer",
				"product",
				"employee"
		}
	)
	List<Transaction> findAll();
	
	@Query(
			value ="SELECT * FROM transaction WHERE customer_id = ?1",
			nativeQuery=true)
	List<Transaction> findAllByCustomer(int id);

}
