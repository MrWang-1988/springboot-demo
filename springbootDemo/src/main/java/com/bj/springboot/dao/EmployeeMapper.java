package com.bj.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bj.springboot.entity.Employee;

@Mapper
public interface EmployeeMapper {

	/**
	 * 增加员工
	 * @param employee
	 * @throws Exception
	 */
	public void addEmp(Employee employee) throws Exception;
	
	public Employee selectEmpById(String empId) throws Exception;
	
	public List<Employee> selectEmpList(Employee employee) throws Exception;
	
	public void updateEmp(Employee employe) throws Exception;
}
