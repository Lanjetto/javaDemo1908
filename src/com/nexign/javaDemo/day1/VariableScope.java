package com.nexign.javaDemo.day1;

public class VariableScope {
    String a;

    void getSomeA() {
        int a = 4;
        System.out.println(a);
    }

    public static void main(String[] args) {
        VariableScope scope = new VariableScope();
        scope.getSomeA();
    }
}
