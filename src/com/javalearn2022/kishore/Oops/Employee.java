package com.javalearn2022.kishore.Oops;

public class Employee {
   private int baseSalary;
   private int hourlyRate;
   public int extraHours;
   public static int numberOfEmployees;

   // Constructor
   public Employee (int baseSalary, int hourlyRate){
      setHourlyRate(hourlyRate);
      setBaseSalary(baseSalary);
      numberOfEmployees++;
   }

   // Constructor Overloading
   public Employee (int baseSalary){
      setHourlyRate(0);
      setBaseSalary(baseSalary);
      numberOfEmployees++;
   }

   // Static method
   // Static methods can only see other static methods in the class.
   public static void printNumberOfEmployees() {
      System.out.println(numberOfEmployees);
   }

   // Assume the base salary , hourly rate is constant so we have not passed here that as arguments ,
   // we can pass that too. we will be updating basesalary ,hourly rate in main method.
   // here static keyword is not used , we use static when we call a method from main method
   public int calculateWage(int extraHours) {
       return baseSalary + (hourlyRate * extraHours);
   }
   // Method Overloading
   public int calculateWage() {
      return calculateWage(0);
   }


   // Getters
   private int getBaseSalary() {
      return baseSalary;
   }

   private int getHourlyRate() {
      return hourlyRate;
   }

   // Setters

   private void setBaseSalary(int baseSalary) {
      if ( baseSalary<=0 )
         throw new IllegalArgumentException("The Base Salary can't be less than zero");
      this.baseSalary = baseSalary;
   }

   private void setHourlyRate(int hourlyRate) {
      if ( hourlyRate<0 )
         throw new IllegalArgumentException("The hourly rate cant be zero");
      this.hourlyRate = hourlyRate;
   }
}
