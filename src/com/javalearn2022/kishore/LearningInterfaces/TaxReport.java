package com.javalearn2022.kishore.LearningInterfaces;

public class TaxReport {

    private TaxCalculator calculator;

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }


    // Constructor Dependency Injection
    public TaxReport (TaxCalculator calculator) {
        this.calculator = calculator;

    }

    public void show () {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }


}
