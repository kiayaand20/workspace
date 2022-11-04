package com.hr.personnel;

import java.time.LocalDate;

//Testing, 1, 2, 3.
//Kiaya is the best!

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }
    public void pay(){
        System.out.println(getName() + " is paid hourly " + (getHours() * getRate()));
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() +
                "rate= " + getRate() + ", " +
                "hours= " + getHours() +
                '}';
    }
}
