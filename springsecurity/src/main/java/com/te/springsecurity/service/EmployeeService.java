package com.te.springsecurity.service;

import com.te.springsecurity.entity.Employee;

public interface EmployeeService {

	Employee addemployee(Employee employee);
	Employee getEmployee(String empId);
}
