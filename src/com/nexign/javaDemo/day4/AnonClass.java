package com.nexign.javaDemo.day4;

import com.nexign.javaDemo.day1.Person;
import com.nexign.javaDemo.day3.Manager;

public class AnonClass {
    public void personTalkingMethod(Person p) {
        p.work();
    }

    public void thingsMoving(Movable m) {
        m.move();
    }

    public static void main(String[] args) {
        AnonClass anonClass = new AnonClass();

        Movable movable = new Boat();

        Manager manager = new Manager(2, "Alex", "M", "sdskjd");

        anonClass.personTalkingMethod(manager);
        anonClass.personTalkingMethod(new Person(2, "a", "m") {
            private String team;

            @Override
            public void work() {
                System.out.println("Work");
            }

            @Override
            public void talk() {
                System.out.println("my team working");
            }
        });
    }
}
