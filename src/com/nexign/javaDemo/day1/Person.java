package com.nexign.javaDemo.day1;

import java.util.Arrays;
import java.util.Objects;

public abstract class Person {
    private int age;
    private String name;
    private String lastName;

    public static int count;

    public Person(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        count++;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void work();

    public void talk() {
        System.out.println("TALNING");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) {
         System.out.println(Person.count);
    }
}
