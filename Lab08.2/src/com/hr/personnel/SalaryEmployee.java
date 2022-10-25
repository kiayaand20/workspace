package com.hr.personnel;

import java.time.LocalDate;

public class SalaryEmployee extends Employee {
    private double salary;

    public SalaryEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void pay(){
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override
    public void work() {
        System.out.println("test");
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary= " + getSalary() +
                '}';
    }
}
