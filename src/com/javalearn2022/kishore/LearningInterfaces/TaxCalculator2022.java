package com.javalearn2022.kishore.LearningInterfaces;

public class TaxCalculator2022 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2022(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.4;
    }
}
