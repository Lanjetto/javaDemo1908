package com.nexign.javaDemo.day4;

import com.nexign.javaDemo.day1.Person;
import com.nexign.javaDemo.day3.Kettle;

public class AbstractDemo extends Person {
    public AbstractDemo(int age, String name, String lastName) {
        super(age, name, lastName);
    }

    @Override
    public void work() {
        System.out.println("Work");
    }

    public static void main(String[] args) {
//        Person person = new Person(2, "Ale", "M");

    }


}
