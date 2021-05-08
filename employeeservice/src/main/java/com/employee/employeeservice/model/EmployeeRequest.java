package com.employee.employeeservice.model;

public class EmployeeRequest {
	private String employeeId;
	private String employeeName;
	private String employeeAge;
	private String employeeGender;
	private String employeePhoneno;
	private String employeeEmailid;
	private String employeeSalary;
	private boolean employeeOfferstatus;
	private int salary;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public String getEmployeePhoneno() {
		return employeePhoneno;
	}
	public void setEmployeePhoneno(String employeePhoneno) {
		this.employeePhoneno = employeePhoneno;
	}
	public String getEmployeeEmailid() {
		return employeeEmailid;
	}
	public void setEmployeeEmailid(String employeeEmailid) {
		this.employeeEmailid = employeeEmailid;
	}
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public boolean isEmployeeOfferstatus() {
		return employeeOfferstatus;
	}
	public void setEmployeeOfferstatus(boolean employeeOfferstatus) {
		this.employeeOfferstatus = employeeOfferstatus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeRequest [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge="
				+ employeeAge + ", employeeGender=" + employeeGender + ", employeePhoneno=" + employeePhoneno
				+ ", employeeEmailid=" + employeeEmailid + ", employeeSalary=" + employeeSalary
				+ ", employeeOfferstatus=" + employeeOfferstatus + ", salary=" + salary + "]";
	}
	
	
}