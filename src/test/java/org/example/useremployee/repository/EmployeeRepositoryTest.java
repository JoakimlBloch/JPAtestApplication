package org.example.useremployee.repository;

import org.example.useremployee.model.Employee;
import org.example.useremployee.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    void testExactlyOneBob() {
        List<Employee> employees = employeeRepository.findEmployeeByName("Bob");
        assertEquals(employees.size(), 1);
    }

    @Test
    void testDeleteBob() {
        List<Employee> employees = employeeRepository.findEmployeeByName("Bob");
        assertEquals(employees.size(), 1);

        Employee bobEmployee = employees.get(0);
        User bob = bobEmployee.getUser();
        userRepository.delete(bob);
    }
}
