package com.praveen.spring.core.di.setter.xml;

public class SIEmployee {

	private String empName;
	private int empId;
	private double empSal;
	private SIDepartment dept;

	public SIEmployee() {

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public SIDepartment getDept() {
		return dept;
	}

	public void setDept(SIDepartment dept) {
		this.dept = dept;
	}

}
