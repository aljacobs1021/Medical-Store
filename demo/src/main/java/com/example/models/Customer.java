package com.example.models;

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
public class Customer {
	
	// mapping the relationships
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	@Column(nullable = false)
	private String first; // first name
	@Column(nullable = false)
	private String last; // last name
	@Column(nullable = false)
	private String role;

	public Customer(int id, String first, String last) {
		super();
		this.customerId = id;
		this.first = first;
		this.last = last;
	}
}

