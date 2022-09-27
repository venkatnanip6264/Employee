package com.example.Employee.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="Employee")
public class EmployeeEntity{
	
	
	@Id
	private int employeeid;
	@NotBlank(message="Please add the Employee Name")
	private String employeename;
	private String employeeemail;
	private String employeepassword;
	
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(int employeeid, String employeename, String employeeemail, String employeepassword) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeeemail = employeeemail;
		this.employeepassword = employeepassword;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeemail() {
		return employeeemail;
	}
	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}
	public String getEmployeepassword() {
		return employeepassword;
	}
	public void setEmployeepassword(String employeepassword) {
		this.employeepassword = employeepassword;
	}
	
	
	
	
	
}
