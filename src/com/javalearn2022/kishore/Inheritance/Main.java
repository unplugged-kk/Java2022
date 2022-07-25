package com.javalearn2022.kishore.Inheritance;

import com.javalearn2022.kishore.Oops.TextBox;

public class Main {
    public static void main(String[] args) {

        var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());

        var box1 = new TextBox();
        System.out.println(box1.hashCode());

        var textbox = new TextBox();
        System.out.println(textbox);

        // Method Overriding check

        var textbox1 = new TextBox();
        textbox1.setText("Hello World");
        System.out.println(textbox1);

        // Upcasting & Downcasting



    }
}
