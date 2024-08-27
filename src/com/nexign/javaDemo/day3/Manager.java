package com.nexign.javaDemo.day3;

import com.nexign.javaDemo.day1.Person;

public class Manager extends Person {
    private final String task;

    public Manager(int age, String name, String lastName, String task) {
        super(age, name, lastName);
        this.task = task;
    }

    public String getTask() {
        return task;
    }



    @Override
    public void work() {
        System.out.println("IM WORKING");
    }

    public static void main(String[] args) {
//        Person person = new Person(23, "Alex", "Mityasov");
        Manager manager = new Manager(23, "Alex", "Mityasov", "kuaghs");

//        person = manager;
//
//        person.work();
//        person.talk();

//        manager = (Manager) person;

        manager.talk();
        System.out.println(manager.getTask());


    }
}
