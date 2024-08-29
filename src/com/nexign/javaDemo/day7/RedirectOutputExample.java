package com.nexign.javaDemo.day7;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.util.Scanner;

public class RedirectOutputExample {
    public static void main(String[] args) {
        // Укажите путь к файлу, в который будет записываться вывод
        String filePath = "output.txt";




        // Сохраняем оригинальный стандартный поток вывода
        PrintStream originalOut = System.out;

        try {
            // Создаем FileOutputStream для записи в файл
            FileOutputStream fos = new FileOutputStream(filePath);
            // Создаем PrintStream, используя FileOutputStream
            PrintStream printStream = new PrintStream(fos);
            // Переопределяем стандартный поток вывода
            System.setOut(printStream);

            // Запись в файл
            System.out.println("Это сообщение будет записано в файл.");
            System.out.println("Еще одна строка в файл.");

            // Закрываем PrintStream
            printStream.close();

            // Восстанавливаем стандартный поток вывода
            System.setOut(originalOut);
            System.out.println("Стандартный вывод восстановлен.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}