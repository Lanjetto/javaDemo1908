package com.nexign.javaDemo.day6;

import java.nio.file.Files;
import java.util.Scanner;

public class ExceptionDemo {
    public double divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("На ноль делить нельзя");
        }
        return (double) a /b;
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите еще число:");
        int b = sc.nextInt();
        double res = 0.;
        try {
            res = demo.divide(a, b);
        } catch (DivideByZeroException e) {
            System.out.println("Введите не ноль:");
            b = sc.nextInt();
            res = demo.divide(a, b);
        }
        System.out.println(res);

    }
}
