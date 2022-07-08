package com.mongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.Model.Employee;
import com.mongo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/e")
	public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee emp){
		System.out.println(emp.getName());
		return new ResponseEntity<Employee>(employeeService.saveOrUpdate(emp),HttpStatus.ACCEPTED);
	}
}
