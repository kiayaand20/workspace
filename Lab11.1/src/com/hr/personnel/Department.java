package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

public class Department {
    // fields
    private String name;
    private String location;

    Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
            emp.work();
        }
    }

    public void payEmployees(){
        for (Employee emp : employees) {
            emp.pay();
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "Department: name=" + getName() + ", location=" + getLocation();
    }
}