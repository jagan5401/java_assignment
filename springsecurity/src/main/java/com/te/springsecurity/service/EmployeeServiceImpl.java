package com.te.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springsecurity.dao.EmployeeDAO;
import com.te.springsecurity.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;
	@Override
	public Employee addemployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}
	@Override
	public Employee getEmployee(String empId) {
		// TODO Auto-generated method stub
		return dao.findByEmpId(empId);
	}

}
