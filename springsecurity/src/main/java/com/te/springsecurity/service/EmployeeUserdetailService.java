package com.te.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.te.springsecurity.dao.EmployeeDAO;
import com.te.springsecurity.entity.Employee;
import com.te.springsecurity.entity.MyUserDetails;

@Service
public class EmployeeUserdetailService implements UserDetailsService {

	@Autowired
	private EmployeeDAO dao;
	private Employee employee;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee employee2 = dao.findByEmpId(username);
		System.out.println("step:5");

		return new MyUserDetails(employee2);
	}

}
