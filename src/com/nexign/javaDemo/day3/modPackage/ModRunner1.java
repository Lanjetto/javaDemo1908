package com.nexign.javaDemo.day3.modPackage;

import com.nexign.javaDemo.day3.ModDemo;

public class ModRunner1 extends ModDemo{
    public static void main(String[] args) {
        ModDemo modDemo = new ModDemo();
        modDemo.pubField = "Hello";

        ModRunner1 modRunner = new ModRunner1();

        modRunner.protectField = "Hello there";

    }
}
