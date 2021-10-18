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
public class Employee {
	
	// mapping the relationships
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private int employeeId;
	
	@Column(name="first_name", nullable = false)
	private String first; // first name
	
	@Column(name="last_name", nullable = false)
	private String last; // last name
	
	@Column(name="role", nullable = false)
	private String role;
	
	@Column(name="salary", nullable = false)
	private double salary;
	
	public Employee(int id, String first, String last) {
		super();
		this.employeeId = id;
		this.first = first;
		this.last = last;
	}
}
