package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.Model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer>{

	
}
