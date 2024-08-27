package com.nexign.javaDemo.day2;

public class ReferenceDemo {

    static String a;
    public static void main(String[] args) {

        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1.equals(i2));

        MyWrapperDemo num1 = new MyWrapperDemo(2);

        Integer num2 = 42;

        int i = 45 + num2;


    }
}
