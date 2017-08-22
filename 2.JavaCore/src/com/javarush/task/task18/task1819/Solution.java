package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String s1, s2;
        byte[] buffer1, buffer2;

        s1 = scanner.nextLine();
        s2 = scanner.nextLine();

        FileOutputStream stream1 = new FileOutputStream(s1, true);
        FileInputStream stream2 = new FileInputStream(s2);
        FileInputStream stream3 = new FileInputStream(s1);


        buffer1 = new byte[stream3.available()];
        buffer2 = new byte[stream2.available()];

        stream3.read(buffer1);
        stream2.read(buffer2);
        stream1.write(buffer2);
        stream1.write(buffer1);

        stream1.close();
        stream2.close();
        stream3.close();
    }
}
