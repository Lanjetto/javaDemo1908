package com.nexign.javaDemo.day1;

import java.util.Scanner;

/**
 * @author Alex Mityasov
 */
public class HelloInput {
    public static void main(String[] args) {
        System.out.println("Enter a name: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
