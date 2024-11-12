package org.example.useremployee.controller;

import org.example.useremployee.model.Employee;
import org.example.useremployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name) {
        return employeeRepository.findEmployeeByName(name);
    }
}
