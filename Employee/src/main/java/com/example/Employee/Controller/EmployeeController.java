package com.example.Employee.Controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.Entity.EmployeeEntity;
import com.example.Employee.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;

	public final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	private Exception EmployeeNotFoundException;

	@GetMapping("/Employee")
	public List<EmployeeEntity> getAllEmployee() {
		logger.info("Inside getAllEmployee of EmployeeController");
		return employeeService.getAllEmployee();
	}

	@PostMapping("/Employees")
	public EmployeeEntity saveEmployee(@Valid @RequestBody EmployeeEntity employee) {
		logger.info("Inside saveEmployee of EmployeeController");
		return employeeService.saveEmployee(employee);
	}

	@DeleteMapping("/Employee/employeeid/{employeeid}")
	public void deleteEmployee(@PathVariable("employeeid") int employeeid) {
		employeeService.deleteById(employeeid);

	}

	@PutMapping("/Employee/{employeeid}")
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity, @PathVariable int employeeid) {
		return employeeService.updateById(employeeid, employeeEntity);
	}

	@GetMapping("/Employee/{id}")
	public EmployeeEntity fetchEmployeeEntityById(@PathVariable("id") int employeeid) {
//		throws com.example.Employee.GlobalException.EmployeeNotFoundException {
		return employeeService.fetchEmployeeEntityById(employeeid);
	}
	
	@GetMapping("/EmployeeByname/{name}")
	public EmployeeEntity findEmployeeName(@PathVariable("name") String employeeName) {
//		System.out.println("name "+employeeName);
		return employeeService.findByEmployeeName(employeeName);
	}

//	@PutMapping("Employeename/{employeename}")
//	public EmployeeEntity updateByEmployeeName(@PathVariable int employeeid, @PathVariable String employeeemail,
//			@PathVariable String employeepassword) {
//
//		return employeeService.updateByEmployeeName(employeeid, employeeemail, employeepassword);
//	}

}
