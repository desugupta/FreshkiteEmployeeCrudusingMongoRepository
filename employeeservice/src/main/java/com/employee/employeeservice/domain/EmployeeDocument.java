package com.employee.employeeservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
public class EmployeeDocument extends BaseDomain {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@Version
	private Integer versionId;
	private String employeeId;
	private String employeeName;
	private String employeeAge;
	private String employeeGender;
	private String employeePhoneno;
	private String employeeEmailid;
	private String employeeSalary;
	private boolean employeeOfferstatus;
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public boolean isEmployeeOfferstatus() {
		return employeeOfferstatus;
	}

	public void setEmployeeOfferstatus(boolean employeeOfferstatus) {
		this.employeeOfferstatus = employeeOfferstatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EmployeeDocument [id=" + id + ", versionId=" + versionId + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", employeeAge=" + employeeAge + ", employeeGender="
				+ employeeGender + ", employeePhoneno=" + employeePhoneno + ", employeeEmailid=" + employeeEmailid
				+ ", employeeSalary=" + employeeSalary + ", employeeOfferstatus=" + employeeOfferstatus + ", salary="
				+ salary + "]";
	}
	
}
