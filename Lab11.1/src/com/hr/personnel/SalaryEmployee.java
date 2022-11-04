package com.hr.personnel;

import gov.irs.TaxPayer;

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
        System.out.println(getName() + " working hard since " + getHireDate());
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary= " + getSalary() +
                '}';
    }

    @Override
    public void payTaxes() {
        double taxes = getSalary() * TaxPayer.SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }
}
