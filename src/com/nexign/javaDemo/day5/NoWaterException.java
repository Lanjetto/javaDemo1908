package com.nexign.javaDemo.day5;

public class NoWaterException extends RuntimeException {
    public NoWaterException() {
        System.err.println("Kettle has no water");
    }
}
