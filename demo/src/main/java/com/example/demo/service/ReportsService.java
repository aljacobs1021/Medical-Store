package com.example.demo.service;

import com.example.demo.dao.ReportsDAO;
import com.example.demo.models.Reports;
import com.example.demo.models.ReportsView;

public class ReportsService {
	
	private ReportsDAO rDao;
	private ReportsView rView;
	
	public void printReport(Reports report) {
		rView.printReportInformation(report);
	}
	
	
}
