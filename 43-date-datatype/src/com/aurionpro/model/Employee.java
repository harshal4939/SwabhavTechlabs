package com.aurionpro.model;

import java.time.LocalDate;


public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	private LocalDate date;

	public Employee(int empId, String empName, double empSalary, LocalDate userdate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.date = userdate;

	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", date=" + date
				+ "]";
	}

}
