package com.javalearn2022.kishore.Inheritance;

import java.sql.SQLOutput;

public class UIControl {

    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    public boolean isEnabled() {
        return isEnabled;
    }


    public  void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }


}
