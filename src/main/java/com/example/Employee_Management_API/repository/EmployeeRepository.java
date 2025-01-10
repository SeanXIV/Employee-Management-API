package com.example.Employee_Management_API.repository;

import com.example.Employee_Management_API.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
