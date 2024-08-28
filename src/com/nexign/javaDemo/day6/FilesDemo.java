package com.nexign.javaDemo.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("resources/files");
//        findFilesFromFolders(path);

        List<Path> list = Files.find(path, Integer.MAX_VALUE, (p, a) -> p.toString().endsWith(".txt"))
                .toList();




    }

//    private static void findFilesFromFolders(Path dir) throws IOException {
//        try (Stream<Path> list = Files.list(dir)) {
//            for (Path path1 : list.toList()) {
//                if (Files.isDirectory(path1)) {
//                    findFilesFromFolders(path1);
//                    continue;
//                }
//                try (BufferedReader bufferedReader = Files.newBufferedReader(path1)) {
//                    String s = null;
//                    while ((s = bufferedReader.readLine()) != null) {
//                        Pattern p = Pattern.compile("[0-3]\\d.[0-1]\\d.[1,2][0,9]\\d{2}");
//                        Matcher m = p.matcher(s);
//                        while (m.find()) {
//                            System.out.println("date: " + m.group());
//                        }
//                    }
//                }
//            }
//
//        }
//    }
}
