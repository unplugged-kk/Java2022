package com.javalearn2022.kishore.Oops;

public class Main {
    public static void main(String[] args) {

        // Employee Class

        var employee = new Employee(50_000,20);

        // below code is hashed as we use constructor in thr employee class
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        // Method Overloading
        int wageWithoutOvertime = employee.calculateWage();
        System.out.println(wage);
        System.out.println(wageWithoutOvertime);

        // Static Method implementation
        Employee.printNumberOfEmployees();

        // Browser Class

        var browser = new Browser();
        browser.navigate("https://www.kishorekumar.today");


    }
}
