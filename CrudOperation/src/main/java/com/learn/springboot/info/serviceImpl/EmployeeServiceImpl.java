package com.learn.springboot.info.serviceImpl;

import org.springframework.stereotype.Service;

import com.learn.springboot.info.model.Employee;
import com.learn.springboot.info.repository.EmployeeRepositiry;
import com.learn.springboot.info.service.EmployeeService;

@Service
// we dont need to add @Transaction annotation here becouse Spring-data-Jpa provide transaction to all its api
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepositiry employeeRepositiry;
	
	public EmployeeServiceImpl(com.learn.springboot.info.repository.EmployeeRepositiry employeeRepositiry) {
		super();
		this.employeeRepositiry = employeeRepositiry;
	}




	@Override
	public Employee saveEmployee(Employee employee) {
		// used constructor inject whenever you will have mandatory parameters
		//and used setter injection when ever you will have optional parameters
		return employeeRepositiry.save(employee);
	}

}
