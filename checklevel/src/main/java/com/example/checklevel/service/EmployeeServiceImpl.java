package com.example.checklevel.service;

import com.example.checklevel.model.Employee;
import com.example.checklevel.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee Create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> Read() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee Update(Long id, Employee employee) {
        return employeeRepository.findById(id)
                .map(e->{
                    e.setDate(employee.getDate());
                    e.setFirst_name(employee.getFirst_name());
                    e.setLast_name(employee.getLast_name());
                    e.setDepartement(employee.getDepartement());
                    return employeeRepository.save(e);
                }).orElseThrow(() -> new RuntimeException("Employee non trouvé !"));
    }

    @Override
    public String Delete(Long id) {
        employeeRepository.deleteById(id);
        return "Employee supprimé";
    }
}
