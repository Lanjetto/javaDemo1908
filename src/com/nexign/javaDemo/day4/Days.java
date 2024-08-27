package com.nexign.javaDemo.day4;

public enum Days {
    MO(1), TU(2), WED(3), THU(4), FRI(5), SAT(6), SUN(7);

    private int num;

    public int getNum() {
        return num;
    }

    Days(int num) {
        this.num = num;
    }
}
