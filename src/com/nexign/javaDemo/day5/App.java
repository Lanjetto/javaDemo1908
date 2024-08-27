package com.nexign.javaDemo.day5;

public class App {
    public static void main(String[] args) {
        Kettle k1 = new Kettle(2.0, "Redmi");
        System.out.println(k1.getVol());
        k1.setWater(new Water(2.0));
        BoiledWater boiledWater = k1.boilWater();

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeSomeDrink(boiledWater, new Coffee());

    }
}
