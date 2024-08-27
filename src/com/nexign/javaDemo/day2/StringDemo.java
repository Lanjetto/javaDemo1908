package com.nexign.javaDemo.day2;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "one two three";
        String[] s = s1.split(";");
//        String join = String.join(s);

        String s2 = new String("one");
        s2 = s2.intern();
        System.out.println(s1 == s2);

        System.out.println(stringMod(s1, 50));
    }

    public static String stringMod(String s, int n) {
       StringBuilder sb = new StringBuilder(s.length() + n);



        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        return sb.toString();
    }
}
