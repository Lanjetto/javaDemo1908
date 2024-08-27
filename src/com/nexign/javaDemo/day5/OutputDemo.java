package com.nexign.javaDemo.day5;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class OutputDemo {
    public static void main(String[] args) {
        String[] str = {"o", "n", "e"};



        try {
            try (FileInputStream fileOutputStream = new FileInputStream("resources/1.txt")) {
                byte[] bytes = fileOutputStream.readAllBytes();
                System.out.println(Arrays.toString(bytes));
            }



        } catch (IOException e) {
            System.out.println("Привет");
        }

        System.out.println("Привет из main");

    }
}
