package com.example.Employee.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Employee.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	
	@Query("SELECT u FROM EmployeeEntity u WHERE u.employeename =:employeeName")

	public EmployeeEntity findByEmployeeName(String employeeName);

//	@Query("update Employee u set u.id = :id From Employee Table where u.employeename = :employeename")
//	public EmployeeEntity updateByEmployeeName(String employeename);

}
