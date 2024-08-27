package com.nexign.javaDemo.day5;

public class Water implements Liquid {
    private final double volume;

    public Water(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }

}
