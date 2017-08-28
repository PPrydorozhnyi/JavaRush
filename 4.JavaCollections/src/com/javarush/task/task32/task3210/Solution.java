package com.javarush.task.task32.task3210;

import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {

        try (RandomAccessFile file = new RandomAccessFile(args[0], "rw")) {

            int number = Integer.parseInt(args[1]);
            String text = args[2];
            int length = text.length();
            byte[] bytes = new byte[length];

            file.read(bytes, number, length);
            String result = convertByteToString(bytes).equals(text) ? "true" : "false";

            file.seek(file.length());
            file.write(result.getBytes());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String convertByteToString (byte readBytes[]) {
        return new String(readBytes);
    }
}
