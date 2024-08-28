package com.nexign.javaDemo.day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.Scanner;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
//        StringReader sr = new StringReader("asdasda");
//        char read = (char) sr.read();
//        System.out.println(read);

        FileReader fr = new FileReader("resources/1.txt");
        String s = null;




        BufferedReader br = new BufferedReader(fr);
        int sum = 0;
        while ((s = br.readLine()) != null) {
           sum+=Integer.parseInt(s);
        }
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println(i + i2);




    }



}
