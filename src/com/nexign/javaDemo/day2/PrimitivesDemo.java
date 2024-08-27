package com.nexign.javaDemo.day2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrimitivesDemo {
    public static void main(String[] args) {
        short a = 4;
        int b = 100000;
        int res = b % a;
        byte s = (byte) 254;
        System.out.println(res);

        a = (short) b;

        char ch = 101;
        char ch1 = 'e';


        double d1 = 12.8;
        BigDecimal bd = BigDecimal.valueOf(d1);
        BigDecimal l1 = bd.setScale(0, RoundingMode.HALF_UP);


        System.out.println(l1);
    }
}
