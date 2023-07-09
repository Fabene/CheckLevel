package com.example.checklevel.controller;

import com.example.checklevel.model.Employee;
import com.example.checklevel.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Employee")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee){
        return employeeService.Create(employee);
    }
    @GetMapping("/read")
    public List<Employee> read (){
        return employeeService.Read();
    }
    @PutMapping("/update/{id}")
    public Employee update(@PathVariable Long id,@RequestBody Employee employee){
        return employeeService.Update(id,employee);
    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return employeeService.Delete(id);
    }
}
