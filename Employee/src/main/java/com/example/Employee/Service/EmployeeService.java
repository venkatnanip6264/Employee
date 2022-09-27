package com.example.Employee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Employee.Entity.EmployeeEntity;
import com.example.Employee.GlobalException.EmployeeNotFoundException;

public interface EmployeeService {

	public List<EmployeeEntity> getAllEmployee();

	public EmployeeEntity saveEmployee(EmployeeEntity employee);

	public void deleteById(int employeeid);

	public EmployeeEntity updateById(int employeeid, EmployeeEntity employeeEntity);
	public EmployeeEntity fetchEmployeeEntityById(int employeeid);

//	public EmployeeEntity fetchEmployeeEntityById(int employeeid) throws EmployeeNotFoundException;

	public EmployeeEntity findByEmployeeName(String employeeName);

//	public EmployeeEntity updateByEmployeeName(int employeeid,String employeeemail, String employeepassword);

//	public EmployeeEntity updateByEmployeeName(String employeename, EmployeeEntity employeeEntity);

}
