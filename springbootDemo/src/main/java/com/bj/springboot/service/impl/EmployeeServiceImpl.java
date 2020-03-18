package com.bj.springboot.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bj.springboot.common.BusinessException;
import com.bj.springboot.dao.EmployeeMapper;
import com.bj.springboot.entity.Employee;
import com.bj.springboot.service.EmployeeService;
import com.bj.springboot.utils.DateUtil;
import com.bj.springboot.utils.UUIDUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeMapper empMapper;
	
	@Override
	public void saveEmp(Employee employee)  throws BusinessException {
		try {
			employee.setEmpId(UUIDUtil.getUUID());
			employee.setCreateTime(DateUtil.getCurrentDate());
			empMapper.addEmp(employee);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new BusinessException("100", "新增员工信息失败!");
		}
	}

	@Override
	public Employee getEmp(String empId) throws BusinessException {
		try {
			Employee employee = empMapper.selectEmpById(empId);
			return employee;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new BusinessException("200", "查询员工信息失败!");
		}
		
	}

	@Override
	public List<Employee> getEmpList(Employee employee) throws BusinessException {
		try {
			List<Employee> empList = empMapper.selectEmpList(employee);
			return empList;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new BusinessException("300", "查询员工列表信息失败!");
		}
	}

	@Override
	public void editEmp(Employee employee) throws BusinessException {
		try {
			empMapper.updateEmp(employee);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new BusinessException("400", "更新员工信息失败!");
		}
	}

}
