package com.javalearn2022.kishore;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class JavaFundamentals {

    public static void main(String[] args) {
	// write your code here

        // Bad Code Standards (Ugly Code)
        int age = 30;
        age = 45;
        System.out.println("Hello Kutte!!");
        System.out.println("Your age is " + age);

        // Good Code Standards ( Use variables in Camel Case notations)

        int myAge = 29;
        int herAge = myAge;
        System.out.println("Her Age is " + herAge);

        // Variable Types [ primitive type which can store data upto a fix value]

        byte varAge = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isElegible = false;

        // Reference type variables ( here the memory is allocated by us )

        byte tempAge = 39;
        Date now = new Date();
        System.out.println(now);

        // Primitive vs Reference

        byte x = 1;
        byte y = x;
        System.out.println(y);
        x = 2;
        System.out.println(y); // here the value of y will not be changed to 2 both are at different memory location and primitive type

        Point point1 = new Point(1,1);  // Reference type variable [Here variable references address of the point object not the value, here both points to same address where variable value is stored]
        Point point2 =  point1;
        System.out.println(point2);
        point1.x = 4;
        point1.y = 5;
        System.out.println(point2);

        // string

        String message = "    Hello \"Kishore\" !!  ";
        System.out.println(message);
        System.out.println(message.endsWith("g"));
        System.out.println(message.length());
        System.out.println(message.indexOf("o"));
        System.out.println(message.replace("!","*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

        // Escape Sequences

        String msg = " Hello \"KK\" ";
        System.out.println(msg);

        // c:\Windows\....

        // so \n , \t can also be used for escape sequence for new line and tab
        String dirPath = "c:\\Windows\\....";
        System.out.println(dirPath);

        // Arrays
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(numbers); // it will show you the address of the array not the values
        // Arrays java class is used to access the arrays and it has several methods too.

        // Arrays.toString(numbers);
        System.out.println(Arrays.toString(numbers));

        // Better way to initialize arrays , we can use braces if we have all items in array

       int [] numbs = {6, 0, 9, 8, 7};
       System.out.println(Arrays.toString(numbs));
       System.out.println(numbs.length);
       Arrays.sort(numbs); // Sorting the array
       System.out.println(Arrays.toString(numbs)); // Sorted array

       // Multi dimentional  Array

       int [] [] multiDimArray = new int[2][3];
       multiDimArray[0][0] = 1;
       multiDimArray[0][1] = 2;
       multiDimArray[1][0] = 3;
       multiDimArray[1][1] = 4;
       System.out.println(Arrays.deepToString(multiDimArray)); // deepToString method is used for 3d arrays

       // Multi Dimentional Array with {}

       int [] [] newMultiDimArray = {{1,2,3},{4,5,6}};
       System.out.println(Arrays.deepToString(newMultiDimArray));

       // Constants

       final float PI = 3.14F;  // constant variables are written in capital letters , we use final keyword so that we don't want to change the value

      // Arithmetic expressions

      int result = 10 + 3;
      System.out.println(result);
      int z = 1;
      int v = z++; // here first the  value of z will be copied to v and then z will be incremented by 1
      System.out.println(z);
      System.out.println(v);

      int k = 6;
      int l = ++k; // here the value of k will be incremented first and then copied to l
      System.out.println(k);
      System.out.println(l);

      // Order of Operations
      int d = 10 + 3 * 2;
      System.out.println(d);

      int e = (10 + 3) * 2;
      System.out.println(e);

      // Casting

      // implicit casting
      // byte > short > int > long
      short s = 1;
      int j = s + 2;
      System.out.println(j);

      // explicit casting
      double r = 1.1;
      int t = (int)r + 2;
      System.out.println(t);

      // Formatting numbers

        // As currency
      NumberFormat currency = NumberFormat.getCurrencyInstance();
      String formattedCurrency = currency.format(12345.67890);
      System.out.println(formattedCurrency);

      // As percent
      NumberFormat beforePercent = NumberFormat.getPercentInstance();
      String afterPercent = beforePercent.format(0.34);
      System.out.println(afterPercent);

      // Method chaining here we are chaining multiple methods together
      String finalResult = NumberFormat.getPercentInstance().format(.39); // 2 methods are used here
      System.out.println(finalResult);

      // Reading input from keyboard
//      Scanner newInput = new Scanner(System.in);
//      System.out.println("Age: ");
//      byte urAge = newInput.nextByte();
//      System.out.println("Your age is " + urAge);
//
//
//      Scanner newScanner = new Scanner(System.in);
//      System.out.println("Name: ");
//      String urName = newScanner.nextLine(); // next() only take 1 input to print full name or more input use nextLine()
//      System.out.println("Your name is " + urName);

      // Comparison operator
      int m = 2 ;
      int n = 2 ;
        System.out.println(x == y);
      // Logical Operations

      int temp = 22;
        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);

      // Logical Or ||

      boolean hasHighIncome = false;
      boolean hasGoodCredit = true;
      boolean hasCriminalRecord = false;
      boolean isEligible = (hasHighIncome || hasGoodCredit && !hasCriminalRecord );
      System.out.println(isEligible);

      // If statement

      int temprature = 32;
      if ( temprature>30 ) {
          System.out.println("Its hot out there");
          System.out.println("drink water");
      }
      else if (temprature > 20 && temprature <=30)
          System.out.println("Beautiful day !! ");
      else
          System.out.println("Cold Day");

      // Simplifying If statement

      int income = 120_000;
      boolean hasHighSalary = false;
      if(income > 100_000)
          hasHighSalary = true;








    }
}
