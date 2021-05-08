package com.employee.employeeservice.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeservice.domain.Employee;
import com.employee.employeeservice.domain.EmployeeDocument;
import com.employee.employeeservice.domain.ResponseObject;
import com.employee.employeeservice.model.CandidateRequest;
import com.employee.employeeservice.model.CandidateResponse;
import com.employee.employeeservice.model.EmployeeRequest;
import com.employee.employeeservice.model.HrRequest;
import com.employee.employeeservice.service.EmployeeService;
import com.employee.employeeservice.util.ResponseUtil;

@RequestMapping("/emp")
@RestController
public class EmpRest {

	@Autowired
	private EmployeeService employeeService;

	private final Logger logger = LoggerFactory.getLogger(EmpRest.class);

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveCandidateInfo(@RequestBody CandidateRequest candidateRequest) {
		try {
			logger.info("+++++ Entry into saveCandidateInfo() method in Rest +++++");
			CandidateResponse candidateDetails = employeeService.saveCandidateDetails(candidateRequest);
			System.out.println("save candidate:" + candidateRequest);
			logger.info("+++++ Entry into saveCandidateInfo() method in Rest +++++");
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createSuccessResponse(candidateDetails),
					HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error in saving candidate information:", e.getMessage());
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createErrorResponse(e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping("/health")
	public String healthCheck() {
		return "Service is running";
	}

	/*
	 * 
	 * @RequestMapping(value = "/releaseOffer", method = RequestMethod.POST) public
	 * ResponseEntity<?> saveEmployeeInfo(@RequestBody List<Employee> employees) {
	 * try { List<EmployeeDocument> employeeDetails =
	 * employeeService.saveEmployeeDetails(employees); return new
	 * ResponseEntity<ResponseObject<?>>(ResponseUtil.createSuccessResponse(
	 * employeeDetails), HttpStatus.OK); } catch (Exception e) {
	 * e.printStackTrace(); logger.error("Error in saving candidate information:",
	 * e.getMessage()); return new
	 * ResponseEntity<ResponseObject<?>>(ResponseUtil.createErrorResponse(e.
	 * getMessage()), HttpStatus.BAD_REQUEST); } }
	 * 
	 */

	/*
	 * @RequestMapping(value = "/releaseOfferto", method = RequestMethod.POST)
	 * public ResponseEntity<?> saveEmployeeInformation(@RequestBody L> ids) { try {
	 * List<EmployeeDocument> employeeDetails =
	 * employeeService.saveEmployeeDetailsNew(ids); return new
	 * ResponseEntity<ResponseObject<?>>(ResponseUtil.createSuccessResponse(
	 * employeeDetails), HttpStatus.OK); } catch (Exception e) {
	 * e.printStackTrace(); logger.error("Error in saving candidate information:",
	 * e.getMessage()); return new
	 * ResponseEntity<ResponseObject<?>>(ResponseUtil.createErrorResponse(e.
	 * getMessage()), HttpStatus.BAD_REQUEST); } }
	 */

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteEmployeeDetails(@RequestParam(value = "employeeId") String employeeId) {
		try {
			logger.info("+++++ Entry into deleteEmployeeDetails() method in Rest +++++");
			EmployeeDocument employeeDocument = employeeService.deleteEmployeeDetails(employeeId);
			System.out.println("deleted employee:" + employeeDocument);
			logger.info("+++++ Entry into deleteEmployeeDetails() method in Rest +++++");
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createSuccessResponse(employeeDocument),
					HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error in deleting employee information:", e.getMessage());
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createErrorResponse(e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployeeDetails(@RequestParam(value = "employeeId") String employeeId) {
		try {
			logger.info("+++++ Entry into getEmployeeDetails() method in Rest +++++");
			EmployeeDocument employeeDocument = employeeService.getEmployeeDetails(employeeId);
			System.out.println("get employee:" + employeeDocument);
			logger.info("+++++ Entry into getEmployeeDetails() method in Rest +++++");
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createSuccessResponse(employeeDocument),
					HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error in getting employee information:", e.getMessage());
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createErrorResponse(e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<?> getAllEmployeeDetails() {
		try {
			logger.info("+++++ Entry into getAllEmployeeDetails() method in Rest +++++");
			List<EmployeeDocument> employeeDocument = employeeService.getAllEmployeeDetails();
			System.out.println("getAll employees:" + employeeDocument);
			logger.info("+++++ Entry into getAllEmployeeDetails() method in Rest +++++");
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createSuccessResponse(employeeDocument),
					HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error in getting all employees information:", e.getMessage());
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createErrorResponse(e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
	public ResponseEntity<?> updateEmployeeInfo(@RequestBody EmployeeRequest employeeRequest) {
		try {
			logger.info("+++++ Entry into updateEmployee() method in Rest +++++");
			EmployeeDocument employeeDetails = employeeService.updateEmployeeDetails(employeeRequest);
			logger.info("+++++ Entry into updateEmployee() method in Rest +++++");
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createSuccessResponse(employeeDetails),
					HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in uodating employee  information:", e.getMessage());
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createErrorResponse(e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/saveAnEmployee", method = RequestMethod.POST)
	public ResponseEntity<?> saveEmployeeInfo(@RequestBody HrRequest hrRequest) {
		try {
			logger.info("+++++ Entry into saveEmployeeInfo() method in Rest +++++");
			EmployeeDocument employeeDetails = employeeService.saveEmployee(hrRequest);
			logger.info("+++++ Entry into saveEmployeeInfo() method in Rest +++++");
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createSuccessResponse(employeeDetails),
					HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in saving employee  information:", e.getMessage());
			return new ResponseEntity<ResponseObject<?>>(ResponseUtil.createErrorResponse(e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

}
