package com.employee.employeeservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employee.employeeservice.domain.CandidateDocument;
import com.employee.employeeservice.model.CandidateRequest;

@Repository
public interface CandidateRepository extends MongoRepository<CandidateDocument, String> {

	public CandidateDocument save(CandidateRequest candidateRequest);

	public CandidateDocument findByCandidateId(String candidateId);

}
