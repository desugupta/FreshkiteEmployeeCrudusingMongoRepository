package com.employee.employeeservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employee.employeeservice.domain.EmployeeDocument;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeDocument, String> {

	void save(List<EmployeeDocument> employeeList);

	public EmployeeDocument deleteByEmployeeId(String employeeId);

	public EmployeeDocument getByEmployeeId(String employeeId);

}


