package com.example.checklevel.service;

import com.example.checklevel.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee Create(Employee employee);

    List<Employee> Read();

    Employee Update(Long id, Employee employee);

    String Delete(Long id);
}
