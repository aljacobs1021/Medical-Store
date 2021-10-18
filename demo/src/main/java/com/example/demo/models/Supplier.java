package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@AllArgsConstructor
@ToString
@Entity
@Table
public class Supplier {
	
	// mapping the relationships
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sup_id")
	private int supplierId;
	
	@Column(name="supplier_name", nullable = false)
	private String supplierName; // first name

}