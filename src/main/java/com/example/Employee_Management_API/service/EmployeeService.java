package com.example.Employee_Management_API.service;


import com.example.Employee_Management_API.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    List<Employee> getAllEmployees();
}
