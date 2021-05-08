package com.employee.employeeservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "candidates")
public class CandidateDocument {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@Version
	private Integer versionId;
	private String candidateId;
	private String candidateName;
	private String candidateAge;
	private String candidateGender;
	private String candidatePhoneno;
	private String candidateEmailid;

	public String getId() {
		return id;
	}

	public String getCandidateGender() {
		return candidateGender;
	}

	public void setCandidateGender(String candidateGender) {
		this.candidateGender = candidateGender;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CandidateDocument [id=" + id + ", versionId=" + versionId + ", candidateId=" + candidateId
				+ ", candidateName=" + candidateName + ", candidateAge=" + candidateAge + ", candidateGender="
				+ candidateGender + ", candidatePhoneno=" + candidatePhoneno + ", candidateEmailid=" + candidateEmailid
				+ "]";
	}

}
