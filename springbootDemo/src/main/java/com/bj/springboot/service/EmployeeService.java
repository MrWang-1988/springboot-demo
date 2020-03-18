package com.bj.springboot.service;

import java.util.List;

import com.bj.springboot.common.BusinessException;
import com.bj.springboot.entity.Employee;

public interface EmployeeService {

	public void saveEmp(Employee employee) throws BusinessException ;
	
	public Employee getEmp(String empId) throws BusinessException ;
	
	public List<Employee> getEmpList(Employee employee) throws BusinessException ;
	
	public void editEmp(Employee employee) throws BusinessException ;
}
