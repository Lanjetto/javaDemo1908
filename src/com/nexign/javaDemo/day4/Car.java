package com.nexign.javaDemo.day4;

public class Car implements Movable{
    private Engine engine;

    private int probeg;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println("drive");
    }

    public static class Engine {
        private double volume;

        public Engine(double volume) {
            this.volume = volume;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

        public static Engine getInstance() {

            return new Engine(2.0);
        }


    }

    public static void main(String[] args) {
        Engine engine1 = Engine.getInstance();
        Car car = new Car(engine1);


    }
}
