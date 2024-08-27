package com.nexign.javaDemo.day2;

import com.nexign.javaDemo.day1.Person;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;



        int[] arr2 = {1,2,3};

//        arr1[3] = 4;
//        arr2[3] = 4;

        int[] arr3 = Arrays.copyOf(arr1, arr1.length * 2);
        arr3[3] = 0;

        Object[] arr7 = {7, new BigDecimal(2)};

        Object[] arr8 = Arrays.copyOf(arr7, 5);

        System.out.println(Arrays.deepToString(arr8));


        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));
        int[][] arr6 = {{1,2,3}, {1,2,4}};

        int[] arr4 = arr1.clone();
        int[] arr5 = arr1;

        arr1[1] = 5;
        System.out.println(arr1[1]);
        System.out.println(arr5[1]);
    }
}
