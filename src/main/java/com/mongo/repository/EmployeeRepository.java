package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.Model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String>{

	
}
