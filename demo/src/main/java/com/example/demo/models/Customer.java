package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

//@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table
public class Customer {
	
	// mapping the relationships
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cust_id")
	private int customerId;
	
	@Column(name="first_name", nullable = false)
	private String first; // first name
	
	@Column(name="last_name", nullable = false)
	private String last; // last name

	
	public Customer() {}
	
	public Customer(int id, String first, String last) {
		this.customerId = id;
		this.first = first;
		this.last = last;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	} 
	
	
}

