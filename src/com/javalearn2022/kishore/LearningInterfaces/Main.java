package com.javalearn2022.kishore.LearningInterfaces;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2022(10_000);
        var report = new TaxReport(calculator);
        report.show();



    }
}
