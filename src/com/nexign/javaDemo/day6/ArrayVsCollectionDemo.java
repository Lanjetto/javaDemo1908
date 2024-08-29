package com.nexign.javaDemo.day6;

import com.nexign.javaDemo.day1.Person;
import com.nexign.javaDemo.day3.Manager;

import java.util.*;

public class ArrayVsCollectionDemo {
    public static void main(String[] args) {
        int[] a = {1,2,3};
//        System.out.println(Arrays.toString(a));

        Person[] p = new Person[5];
        p[0] = new Manager(23, "Alex", "M", "2");
//        p[5] = new Manager(23, "Alex", "M", "2");

        List<Integer> intList = new ArrayList<>(100);

        var a1 = new ArrayList<>(List.of(1,2,3));


        for (int i = 0; i < 20; i++) {
            intList.add(i);
        }
        intList.set(0, 2);

        intList.get(2);
        boolean contains = intList.contains(2);

        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println(intList);

        Set<Integer> st = new HashSet<>(Set.of(1,2,3,4,5));
        System.out.println(st);

    }
}

