package com.example.demo.models;

public class ReportsView {
	
	public void printReportInformation(Reports report) {
		System.out.println("Current Report as of " + java.time.LocalDate.now() + " " 
		+ java.time.LocalTime.now() + ": /nStock: " + report.getProductStockNum() 
		+ " units /nExpenses: $" + report.getTotalExpenses() + " /nIncome: $" 
		+ report.getTotalIncome() + " /nTotal Profit: $" + report.getProfit());
	}
}
