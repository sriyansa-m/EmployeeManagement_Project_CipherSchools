package com.sriyansa.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sriyansa.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}