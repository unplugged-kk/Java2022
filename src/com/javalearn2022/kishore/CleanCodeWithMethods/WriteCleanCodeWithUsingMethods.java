package com.javalearn2022.kishore.CleanCodeWithMethods;

public class WriteCleanCodeWithUsingMethods {
    public static void main(String[] args) {
        // Greet User
//        greetUser("Syler","Syler","Syler");
//        greetUser("Kishore","Kumar","Behera");

        String greetMessage = greetUser("Kishore","Kumar","Behera");
    }

//    public static void greetUser(String firstName, String middleName , String lastName) {
//        System.out.println("Hello!! " + firstName + " "  + middleName + " " + lastName);
//    }
// we will use return statement instead of printing on terminal , now as it returns we need to define the return type too.
    public static String greetUser(String firstName, String middleName , String lastName) {
        return "Hello!! " + firstName + " "  + middleName + " " + lastName;
    }


}
