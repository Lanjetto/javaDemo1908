package com.nexign.javaDemo.day4.dz;

import com.nexign.javaDemo.day3.Manager;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report  со статическим методом generateReport, в котором выводится информация о зарплате всех сотрудников.
 * Используйте форматирование строк. Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
 */
public class PrintReport {

    private static Manager[] managers = {
            new Manager(22, "Alex", "K", "J"),
            new Manager(25, "Stas", "N", "G"),
            new Manager(30, "Denis", "T", "Y"),
    };

    public static void generateReport() {
        for (Manager m : managers) {
            System.out.println("Информация:");
            System.out.print("-----------------------\n");
            System.out.printf("%-10s: %s%n",  "Имя ", m.getName());
            System.out.printf("%-10s: %s%n",  "Фамилия", m.getLastName());
            System.out.printf("%-10s: %s%n",  "Возраст", m.getAge());
            System.out.printf("%-10s: %s%n", "Задача", m.getTask());
            System.out.print("-----------------------\n");

        }

    }

    public static void main(String[] args) {
        generateReport();
    }
}
