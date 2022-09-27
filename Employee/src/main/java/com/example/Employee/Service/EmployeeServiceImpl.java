package com.example.Employee.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.Entity.EmployeeEntity;
import com.example.Employee.GlobalException.EmployeeNotFoundException;
import com.example.Employee.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeEntity> getAllEmployee() {

		return employeeRepository.findAll();
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {
		if (employee.getEmployeename() == null || employee.getEmployeename().equals("")) {
		}

		return employeeRepository.save(employee);
	}

	@Override
	public void deleteById(int employeeid) {
		employeeRepository.deleteById(employeeid);
		
	}

	@Override
	public EmployeeEntity updateById(int employeeid, EmployeeEntity employeeEntity) {
		EmployeeEntity empDB = employeeRepository.findById(employeeid).get();
		if (Objects.nonNull(employeeEntity.getEmployeename())
				&& !"".equalsIgnoreCase(employeeEntity.getEmployeename())) {
			empDB.setEmployeename(employeeEntity.getEmployeename());
		}
		if (Objects.nonNull(employeeEntity.getEmployeeemail())
				&& !"".equalsIgnoreCase(employeeEntity.getEmployeeemail())) {
			empDB.setEmployeeemail(employeeEntity.getEmployeeemail());
		}
		if (Objects.nonNull(employeeEntity.getEmployeepassword())
				&& !"".equalsIgnoreCase(employeeEntity.getEmployeepassword())) {
			empDB.setEmployeepassword(employeeEntity.getEmployeepassword());
		}
		return employeeRepository.save(empDB);

	}

	@Override
	public EmployeeEntity fetchEmployeeEntityById(int employeeid) {
		return employeeRepository.findById(employeeid).get();
		

//		Optional<EmployeeEntity> employeeEntity=employeeRepository.findById(employeeid);
//		if(!employeeEntity.isPresent()) {
//			throw new EmployeeNotFoundException("EmployeeEntity Not Available");
//			
//		}
//		return employeeEntity.get();
	}

	@Override
	public EmployeeEntity findByEmployeeName(String employeeName) {

		return employeeRepository.findByEmployeeName(employeeName);
	}

//	@Override
//	public EmployeeEntity updateByEmployeeName(int employeeid,String employeeemail, String employeepassword) {
//		
//		
//		EmployeeEntity EmployeeEntity=employeeRepository.getById(employeeid);
//		
//		EmployeeEntity.setEmployeeemail(employeeemail);
//		EmployeeEntity.setEmployeepassword(employeepassword);
//		System.out.println(EmployeeEntity);
//
//		
//		// TODO Auto-generated method stub
//		return employeeRepository.save(EmployeeEntity);
//	}

//	@Override
//	public EmployeeEntity updateByEmployeeName(String employeename, EmployeeEntity employeeEntity) {
//
////		if(employeename==null) {
////		// name n=shoutd be empty	
////		}
//		EmployeeEntity edbEntity = findByEmployeeName(employeename);
//		
////		if(edbEntity==null) {
////			//record not found db
////		}
//
//		employeeEntity.setEmployeeid(edbEntity.getEmployeeid());
//		return employeeRepository.save(employeeEntity);
//	}

}
