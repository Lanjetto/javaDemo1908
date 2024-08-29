package com.nexign.javaDemo.day7;

import com.nexign.javaDemo.day3.Manager;
import com.nexign.javaDemo.day3.Programmer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenDemo {
    public static void main(String[] args) {
        Manager manager0 = new Manager(35, "Alex", "M", "J");
        Manager manager1 = new Manager(65, "Stas", "M", "J");
        Programmer programmer = new Programmer(65, "Stas", "M", "J", "Kotlin");

        List<Manager> managerList = new ArrayList<>();

        managerList.add(manager0);
        managerList.add(manager1);
        managerList.add(programmer);

        for (Manager o : managerList) {
            o.work();
        }

        Pair<String, String> pair = new Pair<>("alex", "m");
        Pair<Integer, String> pair1 = new Pair<>(5, "8");
        Integer[] arr1 = {1,2,3,4,5,6};
        String[] arr2 = {"1", "one", "three"};
        System.out.println(isIn(arr1, 8));
        System.out.println(isIn(arr2, "one"));

        getKeyFromPair(new Pair<>(1,"Str"));



        Object[] objArr = arr1;

        List<? extends Object> objList = managerList;




//        objList.add(new Manager(35, "Alex", "M", "J"));
        Manager o = (Manager) objList.get(0);


        List<? super Manager> objLis1 = managerList;
        objLis1.add(new Manager(35, "Alex", "M", "J"));
        objLis1.add(new Programmer(35, "Alex", "M", "J", "lskdhf"));
        Object o1 = objLis1.get(1);
        if (o1 instanceof Programmer) {
            Programmer p1 = (Programmer) o1;
            p1.work();
        }


        Manager m = new Programmer(35, "Alex", "M", "J", "lskdhf");
        m.work();
//
//        o1.work();


    }


    public static <T> boolean isIn(T[] arr, T obj) {
        for (T t : arr) {
            if (t.equals(obj)) {
                return true;
            }
        }
        return false;
    }


    public static void getKeyFromPair(Pair<?, ?> pair) {
        System.out.println(pair.getEl1().getClass());

    }
}
