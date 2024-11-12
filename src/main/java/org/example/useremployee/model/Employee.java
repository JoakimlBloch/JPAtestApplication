package org.example.useremployee.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeID;

    @Column(unique = true)
    private String name;
    private LocalDateTime employed;
    private Gender gender;
    private Boolean vegetarian;

    @OneToOne
    @JoinColumn(name = "user_id_fk", referencedColumnName = "userID", nullable = false)
    private User user;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEmployed() {
        return employed;
    }

    public void setEmployed(LocalDateTime emloyed) {
        this.employed = emloyed;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
