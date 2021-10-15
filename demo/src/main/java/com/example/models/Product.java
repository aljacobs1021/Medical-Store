package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@AllArgsConstructor
@ToString
@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="prod_id")
	private int productId;
	
	@Column (name="prod_name", nullable = false) 
	private String productName; // product name
	
	@Column (name="prod_description", nullable = false)
	private String description;
	
	@Column (name="supplier_id", nullable = false)
	private int supplier;
	
	@Column (name="price", nullable = false)
	private double pricePerUnit;

	public Product(String name, String description, double pPU) {
		super();
		this.productName = name;
		this.description = description;
		this.pricePerUnit = pPU;
	}
}
