package com.nexign.javaDemo.day4;


import com.nexign.javaDemo.day3.FinalDemo;
import com.nexign.javaDemo.day3.VarArgDemo;

import java.util.Scanner;

public class ObjectDemo {
    public static void main(String[] args) {
        Object o = new FinalDemo();


//        Person p1 = new Person(22, "Alex", "M");
//        Person p2 = new Person(22, "Alex", "M");

        Integer i1 = 1000;
        Integer i2 = 1000;

        System.out.println(i1.equals(i2));

//        System.out.println(p1.equals(p2));

        System.out.println("Enter a day number");
        Scanner scanner = new Scanner(System.in);
        Integer dayNum = scanner.nextInt();

        Days d = switch (dayNum) {
            case 1 -> Days.MO;
            case 2 -> Days.TU;
            case 3 -> Days.WED;
            case 4 -> Days.THU;
            case 5 -> Days.FRI;
            case 6 -> Days.SAT;
            case 7 -> Days.SUN;
            default -> throw new IllegalStateException("Unexpected value: " + dayNum);
        };

        for (Days value : Days.values()) {
            System.out.println(value);
        }

        Days mo = Days.valueOf("MO");
        String mon = Days.MO.name();

        int num = mo.getNum();


    }



}
