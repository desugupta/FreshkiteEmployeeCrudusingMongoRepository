package com.employee.employeeservice.model;

public class HrRequest {

	private String candidateId;
	private String employeeSalary;

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "HrRequest [candidateId=" + candidateId + ", employeeSalary=" + employeeSalary + "]";
	}

}
