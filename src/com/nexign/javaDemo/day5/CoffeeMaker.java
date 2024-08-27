package com.nexign.javaDemo.day5;

public class CoffeeMaker {
    public void makeSomeDrink(Liquid... liquid){
        double totavVol  = 0;
        for (Liquid liquid1 : liquid) {
            totavVol += liquid1.getVolume();
        }
        System.out.println("Drink " + totavVol + " volume is ready");
    }
}
