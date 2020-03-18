package com.bj.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bj.springboot.common.BusinessException;
import com.bj.springboot.entity.Employee;
import com.bj.springboot.service.EmployeeService;

@Controller
public class EmployeeTestController {/*
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeTestController.class);
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/emp/{empId}")
	@ResponseBody
	public Employee emp(@PathVariable("empId") String empId){
		Employee employee = null;
		try {
			employee = empService.getEmp(empId);
		} catch (BusinessException e) {
			logger.error(e.getErrorMessage(),e);
		}
		return employee;
	}
	
	@PostMapping("/emp")
	@ResponseBody
	public String saveEmp(Employee employee){
		try {
			empService.saveEmp(employee);
			return "success";
		} catch (BusinessException e) {
			logger.error(e.getErrorMessage(),e);
			return "error";
		}
	}
	
	
	@GetMapping("/emp")
	@ResponseBody
	public List<Employee> emp(Employee employee){
		List<Employee> empList = null;
		try {
			empList = empService.getEmpList(employee);
		} catch (BusinessException e) {
			logger.error(e.getErrorMessage(),e);
		}
		return empList;
	}
	
*/}
