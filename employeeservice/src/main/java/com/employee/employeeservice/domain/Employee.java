package com.employee.employeeservice.domain;

public class Employee {

	private String candidateId;
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	@Override
	public String toString() {
		return "Employee [candidateId=" + candidateId + ", salary=" + salary + "]";
	}
	
}
