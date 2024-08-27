package com.nexign.javaDemo.day3;

public class VarArgDemo {
    public static void main(String[] args) {
        System.out.println(varArgMethod(1));
        System.out.println(varArgMethod(1, 2));
        System.out.println(varArgMethod(1, 2, 3, 4, 5, 6, 7, 78, 89));


    }

    public static int varArgMethod(int...num) {
        int s = 0;
        for (int i : num) {
            s+=i;
        }
        return s;
    }
}
