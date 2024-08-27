package com.nexign.javaDemo.day3;

public class Kettle {
    private final double vol;
    private String title;

    public Kettle(double volume) {
        vol = volume;
        this.title = "Samsung";
    }

    public Kettle(double vol, String title) {
        this.vol = vol;
        this.title = title;
    }


    public Kettle(String title, double vol) {
        this.vol = vol;
        this.title = title;
    }


    public double getVol() {
        return vol;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

        public Kettle() {
            this(1.);
        }

    @Override
    public String toString() {
        return "Kettle{" +
                "vol=" + vol +
                ", title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Kettle samsung = new Kettle(2., "Samsung");
        Kettle noName = new Kettle(2.);


        System.out.println(samsung);
        System.out.println(noName);
    }
}
