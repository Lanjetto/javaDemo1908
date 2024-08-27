package com.nexign.javaDemo.day2;

public class CycleDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String[] arr1 = {"1","2","3","2","3","2"};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        for (String i : arr1) {
//            System.out.println(i);
//        }

        String element = "2";
        int count = 0;
        for(String i: arr1) {
            System.out.println(i);
            if (!element.equals(i)) {
                continue;
            }
            count++;
        }
        System.out.println("Найдено " + count);
    }
}
