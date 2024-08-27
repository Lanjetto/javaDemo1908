package com.nexign.javaDemo.day4;

public class Boat implements Movable, Runnable, Comparable<Boat> {
    @Override
    public void move() {
        System.out.println("Swim");
    }

    @Override
    public int compareTo(Boat o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
