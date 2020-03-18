package com.bj.springboot.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bj.springboot.common.BusinessException;
import com.bj.springboot.entity.Employee;
import com.bj.springboot.service.EmployeeService;

@Controller
public class EmployeeController {

	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService empService;
	
	/**
	 * 返回JSON字符串
	 * @param empId
	 * @param map
	 * @return
	 */
	@GetMapping("/emp/{empId}")
	public Employee emp(@PathVariable("empId") String empId,Map map){
		Employee employee = null;
		try {
			employee = empService.getEmp(empId);
		} catch (BusinessException e) {
			logger.error(e.getErrorMessage(),e);
		}
		return employee;
	}
	
	@PostMapping("/emp")
	public String saveEmp(Employee employee){
		try {
			empService.saveEmp(employee);
			return "redirect:/emps";
		} catch (BusinessException e) {
			logger.error(e.getErrorMessage(),e);
			return "error";
		}
	}
	
	
	@GetMapping("/emps")
	public String emps(Employee employee,Map map){
		List<Employee> empList = null;
		try {
			empList = empService.getEmpList(employee);
			map.put("empList", empList);
		} catch (BusinessException e) {
			logger.error(e.getErrorMessage(),e);
		}
		return "emp/emp";
	}
}
