package com.employee.employeeservice.domain;

import java.util.List;

public class EmployeeList {
	
	private List<Employee> employees;

	public List<Employee> getEmployeeList() {
		return employees;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employees = employeeList;
	}

	@Override
	public String toString() {
		return "EmployeeList [employeeList=" + employees + "]";
	}
	
	 
}
