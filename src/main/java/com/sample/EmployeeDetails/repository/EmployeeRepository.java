package com.sample.EmployeeDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.EmployeeDetails.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
