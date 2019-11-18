package com.codeclan.example.employeeTracker.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "name")
    private String name ;
    @Column(name = "employeeNumber")
    private int employeeNumber ;
    @Column(name = "age")
    private int age ;
    @Column(name = "email")
    private String email ;

    public Employee(String name, int age, int employeeNumber, String email) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.age = age;
        this.email = email;
    }
    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
