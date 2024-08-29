package com.nexign.javaDemo.day7;

import com.nexign.javaDemo.day1.Person;
import com.nexign.javaDemo.day3.Manager;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
//        List<Integer> ints = List.of(1,2,3);
//        PriorityQueue<String> strings = new PriorityQueue<>();
//        strings.offer("Moscow");
//        strings.offer("St.Petersburg");
//        strings.offer("Chelyabinsk");
//        strings.offer("Samara");
//
//
//        for (String string : strings) {
//            System.out.println(string);
//        }

        PriorityQueue<Person> people = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() == o2.getAge()) {
                    return o1.getName().compareTo(o2.getName());
                };
                return o1.getAge() - o2.getAge();
            }
        });
        people.offer(new Manager(35, "Alex", "M", "J"));
        people.offer(new Manager(50, "Stas", "B", "J"));
        people.offer(new Manager(35, "Oleg", "C", "J"));
        people.offer(new Manager(60, "Olga", "F", "J"));

        for (Person person : people) {
            System.out.println(person);
        }


        Deque<String> d = new ArrayDeque<>();
    }
}
