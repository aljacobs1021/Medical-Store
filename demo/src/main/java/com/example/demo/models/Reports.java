package com.example.demo.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class Reports {
	
	private List<Integer> productStockNum;
	private double totalExpenses;
	private double totalIncome;
	private double profit;
	
}
