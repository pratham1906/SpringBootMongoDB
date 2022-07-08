package com.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mongo.repository.EmployeeRepository;

public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	
}
