package com.te.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springsecurity.dto.Authenticatereaquest;
import com.te.springsecurity.dto.AuthenticationResponse;
import com.te.springsecurity.dto.SuccessResponse;
import com.te.springsecurity.entity.Employee;
import com.te.springsecurity.filter.EmployeeJwtFilter;
import com.te.springsecurity.jwtutil.JwtUtil;
import com.te.springsecurity.service.EmployeeService;

@RestController
public class Controller {

	@Autowired
	private AuthenticationManager manager;
	
	@Autowired
	private EmployeeJwtFilter filter;
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private UserDetailsService service;
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<SuccessResponse> Register(@RequestBody Employee employee) {
		Employee addemployee = employeeService.addemployee(employee);
		if (addemployee!=null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addemployee).error(false).msg("Success").build(),HttpStatus.OK);			
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addemployee).error(true).msg("failed").build(),HttpStatus.BAD_REQUEST);			

		}
		
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<AuthenticationResponse> getauthenticate(@RequestBody Authenticatereaquest request) {
		System.out.println("step:1");
		manager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmpId(), request.getPassword()) );
	UserDetails userDetails = service.loadUserByUsername(request.getEmpId());
	String generateToken = jwtUtil.generateToken(userDetails);
	return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse(generateToken),HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<?> getEmployee(@PathVariable String empId){
		Employee employee = employeeService.getEmployee(empId);
		if(employee!=null) {
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		}else {
			return new ResponseEntity<String>(" No Data",HttpStatus.BAD_REQUEST);
		}
	}
}
