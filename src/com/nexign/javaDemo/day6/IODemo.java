package com.nexign.javaDemo.day6;


import java.io.*;

public class IODemo {
    public static void main(String[] args) throws IOException {
        try (InputStream is =
                     new BufferedInputStream(new FileInputStream("resources/1.txt"));
             OutputStream os =
                     new BufferedOutputStream(new FileOutputStream("resources/2.txt"))) {
            is.transferTo(os);


        }
    }
}
