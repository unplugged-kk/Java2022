package com.javalearn2022.kishore.LearningExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader ( "file.txt" );
            System.out.println("File Opened");
        }catch (FileNotFoundException ex ) {
            System.out.println(ex.getMessage());
        }

    }

}