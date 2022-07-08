package com.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.Model.Employee;
import com.mongo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	
	public Employee saveOrUpdate(Employee emp) {
		return empRepo.save(emp);
	}
	
}
