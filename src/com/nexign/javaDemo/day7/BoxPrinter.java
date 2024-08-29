package com.nexign.javaDemo.day7;

import java.util.ArrayList;
import java.util.List;

public class BoxPrinter {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>(
                List.of(
                        new HeavyBox(2.5),
                        new HeavyBox(3.3),
                        new HeavyBox(15.5),
                        new HeavyBox(0.5)

                )
        );

        heavyBoxes.forEach(System.out::println);

        heavyBoxes.get(0).setWeight(heavyBoxes.get(0).getWeight() -1.);

        heavyBoxes.forEach(System.out::println);

        heavyBoxes.remove(heavyBoxes.size() -1);


        HeavyBox[] heavyBoxes1 = new HeavyBox[heavyBoxes.size()];
        heavyBoxes.toArray(heavyBoxes1);


    }
}
