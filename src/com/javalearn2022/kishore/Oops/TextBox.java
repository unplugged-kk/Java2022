package com.javalearn2022.kishore.Oops;

import com.javalearn2022.kishore.Inheritance.UIControl;
import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class TextBox extends UIControl {


    private String text; //field

    public TextBox() {
        super(true); // calling constructor form the base class
        System.out.println("Text Box");
    }

    // method over riding , we are overriding the toString method of textbox class
    @Override
    public String toString() {
      return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
