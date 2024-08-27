package com.nexign.javaDemo.day4;

public interface Movable {

 int a =5;
    void move();

    default String doSmth() {
        return "Hello";
    }



}
