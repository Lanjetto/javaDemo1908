package com.nexign.javaDemo.day1;

import java.util.Random;

public class MainDemo {

    public static void main(String[] a) {
        int number1 = getSomeNumber(50);
        System.out.println(number1);
        int number2 = getSomeNumber(20);
        System.out.println(number2);
        int result = number1 + number2;
        System.out.println(result + Integer.parseInt(a[0]));


    }

    public static int getSomeNumber(int bound) {
        Random random = new Random();
        int r = random.nextInt(0, bound);
//        System.out.println(r);
        return r;
    }

}
