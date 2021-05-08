package com.employee.employeeservice.model;

public class CandidateRequest {

	private String candidateId;
	private String candidateName;
	private String candidateAge;
	private String candidateGender;
	private String candidatePhoneno;
	private String candidateEmailid;
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getCandidateAge() {
		return candidateAge;
	}
	public void setCandidateAge(String candidateAge) {
		this.candidateAge = candidateAge;
	}
	public String getCandidateGender() {
		return candidateGender;
	}
	public void setCandidateGender(String candidateGender) {
		this.candidateGender = candidateGender;
	}
	public String getCandidatePhoneno() {
		return candidatePhoneno;
	}
	public void setCandidatePhoneno(String candidatePhoneno) {
		this.candidatePhoneno = candidatePhoneno;
	}
	public String getCandidateEmailid() {
		return candidateEmailid;
	}
	public void setCandidateEmailid(String candidateEmailid) {
		this.candidateEmailid = candidateEmailid;
	}
	
	@Override
	public String toString() {
		return "CandidateRequest [candidateId=" + candidateId + ", candidateName=" + candidateName + ", candidateAge="
				+ candidateAge + ", candidateGender=" + candidateGender + ", candidatePhoneno=" + candidatePhoneno
				+ ", candidateEmailid=" + candidateEmailid + "]";
	}
	
}
