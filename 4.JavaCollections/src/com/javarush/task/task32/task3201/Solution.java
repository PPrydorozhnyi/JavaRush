package com.javarush.task.task32.task3201;

import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) {

        try (RandomAccessFile file = new RandomAccessFile(args[0], "w")) {

            long number = Long.parseLong(args[1]);
            long pointer;

            pointer = number > file.length() ? file.length() : number;

            file.seek(pointer);
            file.write(args[2].getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
