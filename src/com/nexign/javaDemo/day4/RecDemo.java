package com.nexign.javaDemo.day4;

public record RecDemo(int a, double b) {
    public static void main(String[] args) {
        RecDemo recDemo = new RecDemo(4, 2.00);
        RecDemo recDemo1 = new RecDemo(4, 2.00);

        System.out.println(recDemo1);
        System.out.println(recDemo1.equals(recDemo));

        int a1 = recDemo.a;


    }
}
