package com.bj.springboot.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String empId;
	private String empName;
	private String gender;
	private String phone;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date entryDate;
	private String deptId;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Employee(String empId, String empName, String gender, String phone, Date entryDate, String deptId,
			Date createTime) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.phone = phone;
		this.entryDate = entryDate;
		this.deptId = deptId;
		this.createTime = createTime;
	}
	public Employee() {
		super();
	}
	
}
