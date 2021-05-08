package com.employee.employeeservice.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeeservice.domain.CandidateDocument;
import com.employee.employeeservice.domain.Employee;
import com.employee.employeeservice.domain.EmployeeDocument;
import com.employee.employeeservice.model.CandidateRequest;
import com.employee.employeeservice.model.CandidateResponse;
import com.employee.employeeservice.model.EmployeeRequest;
import com.employee.employeeservice.model.HrRequest;
import com.employee.employeeservice.repository.CandidateRepository;
import com.employee.employeeservice.repository.EmployeeRepository;
import com.employee.employeeservice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private CandidateRepository candidateRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ModelMapper modelMapper;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public CandidateResponse saveCandidateDetails(CandidateRequest candidateRequest) {
		try {
			CandidateResponse candidateResponse = new CandidateResponse();
			CandidateDocument candidateDocument = new CandidateDocument();
			String candidateId = Integer.toString(generateRandomnumber());
			candidateDocument.setCandidateName(candidateRequest.getCandidateName());
			candidateDocument.setCandidateAge(candidateRequest.getCandidateAge());
			candidateDocument.setCandidateEmailid(candidateRequest.getCandidateEmailid());
			candidateDocument.setCandidateGender(candidateRequest.getCandidateGender());
			candidateDocument.setCandidatePhoneno(candidateRequest.getCandidatePhoneno());
			candidateDocument.setCandidateId(candidateId);
			candidateDocument = candidateRepository.save(candidateDocument);
			candidateResponse = modelMapper.map(candidateDocument, CandidateResponse.class);
			return candidateResponse;
		} catch (Exception e) {
			logger.error("Error occurred while saving candidate details:", e);
			throw e;
		}
	}

	public int generateRandomnumber() {
		int sixDigitNumber = new Random().nextInt(999999);
		return sixDigitNumber;
	}

	@Override
	public List<EmployeeDocument> saveEmployeeDetails(List<Employee> employees) throws Exception {
		try {
			List<EmployeeDocument> employeeList = new ArrayList<>();
			EmployeeDocument employee = null;
			for (int i = 0; i <= employees.size(); i++) {
				CandidateDocument candidateDetails = candidateRepository
						.findByCandidateId(employees.get(i).getCandidateId());
				if (candidateDetails.getCandidateId() != null && !candidateDetails.getCandidateId().isEmpty()) {
					employee = new EmployeeDocument();
					employee.setEmployeeName(candidateDetails.getCandidateName());
					employee.setEmployeeAge(candidateDetails.getCandidateAge());
					employee.setEmployeeEmailid(candidateDetails.getCandidateEmailid());
					employee.setEmployeeId(candidateDetails.getCandidateId());
					employee.setEmployeeGender(candidateDetails.getCandidateGender());
					employee.setEmployeePhoneno(candidateDetails.getCandidatePhoneno());
					employee.setEmployeeOfferstatus(true);
					employee.setSalary(employees.get(i).getSalary());
					employeeList.add(employee);
				}
			}
			employeeRepository.saveAll(employeeList);
			return employeeList;
		} catch (Exception e) {
			logger.error("Error occurred while saving list of employee details:", e);
			throw e;
		}
	}

	@Override
	public List<EmployeeDocument> saveEmployeeDetailsNew(List<String> ids) {
		List<EmployeeDocument> employeeList = new ArrayList<>();
		EmployeeDocument employee = null;
		for (int i = 0; i <= ids.size(); i++) {
			CandidateDocument candidateDetails = candidateRepository.findByCandidateId(ids.get(i));
			if (candidateDetails.getCandidateId() != null && !candidateDetails.getCandidateId().isEmpty()) {
				employee = new EmployeeDocument();
				employee.setEmployeeName(candidateDetails.getCandidateName());
				employee.setEmployeeAge(candidateDetails.getCandidateAge());
				employee.setEmployeeEmailid(candidateDetails.getCandidateEmailid());
				employee.setEmployeeId(candidateDetails.getCandidateId());
				employee.setEmployeeGender(candidateDetails.getCandidateGender());
				employee.setEmployeePhoneno(candidateDetails.getCandidatePhoneno());
				employee.setEmployeeOfferstatus(true);
				// employee.setSalary(employees.get(i).getSalary());
				employeeList.add(employee);
			}
		}
		employeeRepository.saveAll(employeeList);
		return employeeList;
	}

	/*
	 * @Override public EmployeeDocument updateEmployeeDetails(String employeeId) {
	 * private String employeeId; private String employeeName; private String
	 * employeeAge; private String employeeGender; private String employeePhoneno;
	 * private String employeeEmailid; private String employeeSalary; private
	 * boolean employeeOfferstatus; private int salary;
	 * 
	 * return null; }
	 */

	@Override
	public EmployeeDocument deleteEmployeeDetails(String employeeId) {
		try {
			EmployeeDocument employeeDocument = employeeRepository.deleteByEmployeeId(employeeId);
			System.out.println(employeeDocument);
			return employeeDocument;
		} catch (Exception e) {
			logger.error("Error occurred while deleting employee details:", e);
			throw e;
		}
	}

	@Override
	public EmployeeDocument getEmployeeDetails(String employeeId) {
		try {
			EmployeeDocument employeeDocument = employeeRepository.getByEmployeeId(employeeId);
			System.out.println(employeeDocument);
			return employeeDocument;
		} catch (Exception e) {
			logger.error("Error occurred while getting employee details:", e);
			throw e;
		}
	}

	@Override
	public List<EmployeeDocument> getAllEmployeeDetails() {
		try {
			List<EmployeeDocument> employeeDocument = employeeRepository.findAll();
			System.out.println(employeeDocument);
			return employeeDocument;
		} catch (Exception e) {
			logger.error("Error occurred while getting all employee details:", e);
			throw e;
		}
	}

	@Override
	public EmployeeDocument updateEmployeeDetails(EmployeeRequest employeeRequest) {
		try {
			EmployeeDocument updatedEmployee = employeeRepository.getByEmployeeId(employeeRequest.getEmployeeId());
			if (updatedEmployee != null) {
				updatedEmployee.setEmployeeName(employeeRequest.getEmployeeName());
				updatedEmployee.setEmployeeAge(employeeRequest.getEmployeeAge());
				updatedEmployee.setEmployeeGender(employeeRequest.getEmployeeGender());
				updatedEmployee.setEmployeePhoneno(employeeRequest.getEmployeePhoneno());
				updatedEmployee.setEmployeeEmailid(employeeRequest.getEmployeeEmailid());
				updatedEmployee.setEmployeeOfferstatus(employeeRequest.isEmployeeOfferstatus());
				updatedEmployee.setEmployeeSalary(employeeRequest.getEmployeeSalary());
				employeeRepository.save(updatedEmployee);
				updatedEmployee = modelMapper.map(updatedEmployee, EmployeeDocument.class);
			}
			return updatedEmployee;
		} catch (Exception e) {
			logger.error("Error occurred while updating employee details:", e);
			throw e;
		}
	}

	@Override
	public EmployeeDocument saveEmployee(HrRequest hrRequest) {
		try {
			EmployeeDocument employeeDocument = new EmployeeDocument();
			CandidateDocument candidateDocument = candidateRepository.findByCandidateId(hrRequest.getCandidateId());
			if (candidateDocument != null) {
				String employeeId = Integer.toString(generateRandomnumber());
				employeeDocument.setEmployeeAge(candidateDocument.getCandidateAge());
				employeeDocument.setEmployeeEmailid(candidateDocument.getCandidateEmailid());
				employeeDocument.setEmployeeGender(candidateDocument.getCandidateGender());
				employeeDocument.setEmployeeId(employeeId);
				employeeDocument.setEmployeeName(candidateDocument.getCandidateName());
				employeeDocument.setEmployeeOfferstatus(true);
				employeeDocument.setEmployeePhoneno(candidateDocument.getCandidatePhoneno());
				employeeDocument.setEmployeeSalary(hrRequest.getEmployeeSalary());
				employeeDocument = employeeRepository.save(employeeDocument);
			}
			return employeeDocument;
		} catch (Exception e) {
			logger.error("Error occurred while saving employee details:", e);
			throw e;
		}
	}

}
