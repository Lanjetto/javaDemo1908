package com.nexign.javaDemo.day7;

import java.util.List;

public class FuncDemo {

    public static  <T, V> void calculator(T a, V b, Calculateable<T, V> calculateable) {
        Double calculate = calculateable.calculate(a, b);
        System.out.println(calculate);
    }

    public static void main(String[] args) {
        calculator(4, 5.0, (x, y) -> {
                    System.out.println("x, y");
                    return x * y -2;
                });

        DumbInterface d = System.out::println;

        d.print("x");

        List.of(1,2,3)
                .stream()
                .filter((x) -> x%2 == 0)
                .map(HeavyBox::new)
                .forEach(System.out::println);


    }


}
