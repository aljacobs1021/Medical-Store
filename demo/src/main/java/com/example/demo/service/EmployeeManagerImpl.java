package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.models.Employee;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
	
	@Autowired
	private EmployeeDAO empDAO;
	
	@Override
	public List<Employee> findAll() {
		return empDAO.findAll();
	}

}
