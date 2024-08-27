package com.nexign.javaDemo.day2;

public class TernDemo {
    public static void main(String[] args) {
        System.out.println(faceControl(20));
    }

    public static String faceControl(int age) {
        return age >= 18 ? "Можно" : "Нельзя";
    }



}
