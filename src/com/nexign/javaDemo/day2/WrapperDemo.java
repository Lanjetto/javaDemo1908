package com.nexign.javaDemo.day2;

import java.math.BigDecimal;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 42;
        Integer b = Integer.MAX_VALUE;
        double d = 12.0;
        double d1 = 0.;
        double v = d / d1;

        BigDecimal bd1 = BigDecimal.valueOf(d);
        BigDecimal bd2 = BigDecimal.ZERO;

        System.out.println(bd1.divide(bd2));



    }
}
