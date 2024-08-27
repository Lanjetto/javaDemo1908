package com.nexign.javaDemo.day5;

public class Kettle {
    private double vol;
    private String name;
    private Water water;


    public Kettle(double vol, String name) {
        this.vol = vol;
        this.name = name;
        System.out.println("Kettle " + name + " initialized");
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public BoiledWater boilWater() {
        if (water!= null) {
            System.out.println("Water boiled");
            return new BoiledWater(water.getVolume());
        }
       throw new NoWaterException();
    }
}
