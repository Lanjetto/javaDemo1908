package com.nexign.javaDemo.day6;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("resources/2.txt");
//        BufferedInputStream bf = new BufferedInputStream(fileInputStream);
        OutputStream os = new FileOutputStream("resources/2.txt");
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(1);
        dos.writeInt(2);
        dos.writeInt(3);

        DataInputStream ds = new DataInputStream(fileInputStream);
//        InputStreamReader ir = new InputStreamReader(ds);
//        BufferedReader br = new BufferedReader(ir);

//        String s = br.readLine();
//        System.out.println(Integer.parseInt(s));
        System.out.println(ds.read());
        int i = 0;
        while ((i = ds.readInt()) > -1) {
            System.out.println(i);
        }



//        FileOutputStream os = new FileOutputStream("resources/2.txt", true);
//        PrintStream ps = new PrintStream(os);
//
//        ps.println("asdasd");
//        ps.append("123123");

    }
}
