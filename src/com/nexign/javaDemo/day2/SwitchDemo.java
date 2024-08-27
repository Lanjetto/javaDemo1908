package com.nexign.javaDemo.day2;

public class SwitchDemo {
    public static void main(String[] args) {
        dayCatcher(1);
    }


    public static void dayCatcher(int i) {

        if (i <= 0 || i >7) {
            System.out.println("не день");
            return;
        }
        switch (i) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходные");
        }
    }
}
