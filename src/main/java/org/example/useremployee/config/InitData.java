package org.example.useremployee.config;

import org.example.useremployee.model.Employee;
import org.example.useremployee.model.User;
import org.example.useremployee.repository.EmployeeRepository;
import org.example.useremployee.repository.UserRepository;
import org.example.useremployee.model.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        User us1 = new User();
        us1.setEmail("us1@kea.dk");
        us1.setPassword("1234");
        userRepository.save(us1);

        User us2 = new User();
        us2.setEmail("us2@kea.dk");
        us2.setPassword("12345");
        userRepository.save(us2);

        User emp = new User();
        emp.setEmail("emp1@kea.dk");
        emp.setPassword("12456");
        userRepository.save(emp);

        Employee emp1 = new Employee();
        emp1.setUser(emp);
        emp1.setName("Bob");
        emp1.setGender(Gender.OTHER);
        emp1.setVegetarian(true);
        emp1.setEmployed(LocalDateTime.now());
        employeeRepository.save(emp1);
    }
}
