package com.nexign.javaDemo.day4.dz;

/**
 * 3.	Заменить каждое второе вхождение строки
 * Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP». Например, строка
 * "Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
 * должна быть преобразована в
 * "Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."
 */
public class StringReplace {


    public static void main(String[] args) {
        String inputString = """
                Object-oriented programming is a programming language model organized around objects rather 
                than "actions" and data rather than logic. 
                Object-oriented programming blabla. Object-oriented programming bla.
                """
                .toLowerCase();
        String target = "object-oriented programming";
        String replace = "OOP";

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        int index = 0;

        while(index < inputString.length()) {
            int nextIndex = inputString.indexOf(target, index);

            if (nextIndex == -1) {
                stringBuilder.append(inputString.substring(index));
                break;
            }

            stringBuilder.append(inputString, index, nextIndex);
            count++;


            if (count %2 ==0) {
                stringBuilder.append(replace);
            } else {
                stringBuilder.append(target);
            }

            index = nextIndex + target.length();
        }
        System.out.println(stringBuilder);
    }
}
