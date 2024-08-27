package com.nexign.javaDemo.day3;

public class ImmutableDemo {
    double p = Math.PI;
    public static final double G = 9.81;
    public static double Gstat = 9.81;
    public final double Gfin = 9.81;

    public static void main(String[] args) {
        ImmutableDemo immutableDemo = new ImmutableDemo();
        Kettle k = new Kettle(2.);
        String kTitle = k.getTitle();
        double vol = k.getVol();

        k.setTitle("Samsung");


    }

}
