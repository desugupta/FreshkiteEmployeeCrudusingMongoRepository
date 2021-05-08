package com.employee.employeeservice.service;

import java.util.List;

import com.employee.employeeservice.domain.Employee;
import com.employee.employeeservice.domain.EmployeeDocument;
import com.employee.employeeservice.model.CandidateRequest;
import com.employee.employeeservice.model.CandidateResponse;
import com.employee.employeeservice.model.EmployeeRequest;
import com.employee.employeeservice.model.HrRequest;

public interface EmployeeService {

	public CandidateResponse saveCandidateDetails(CandidateRequest candidateRequest);

	public List<EmployeeDocument> saveEmployeeDetails(List<Employee> employees) throws Exception;

	public List<EmployeeDocument> saveEmployeeDetailsNew(List<String> ids);

	public EmployeeDocument deleteEmployeeDetails(String employeeId);

	public EmployeeDocument getEmployeeDetails(String employeeId);

	public List<EmployeeDocument> getAllEmployeeDetails();
	
	public EmployeeDocument updateEmployeeDetails(EmployeeRequest employeeRequest);

	public EmployeeDocument saveEmployee(HrRequest hrRequest);

}
