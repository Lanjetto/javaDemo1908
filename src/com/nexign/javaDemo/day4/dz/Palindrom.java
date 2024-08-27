package com.nexign.javaDemo.day4.dz;

/**
 * 1.	Напишите программу, которая проверят, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. Символы пробела, знаки препинания и регистр символов должны игнорироваться. Символы из таблицы ASCII (цифры, латинские буквы, знаки препинания).
 */
public class Palindrom {

    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            }
        }


        String reverse = stringBuilder.reverse().toString();
        return reverse.contentEquals(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("lo1L"));
    }
}
