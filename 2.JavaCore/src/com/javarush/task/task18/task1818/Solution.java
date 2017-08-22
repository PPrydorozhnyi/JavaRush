package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String first, second, third;

        first = scanner.nextLine();
        second = scanner.nextLine();
        third = scanner.nextLine();

        FileOutputStream stream1 = new FileOutputStream(first, true);
        FileInputStream stream2 = new FileInputStream(second);
        FileInputStream stream3 = new FileInputStream(third);

        byte[] buffer1 = new byte[stream2.available()];
        byte[] buffer2 = new byte[stream3.available()];

        stream2.read(buffer1);
        stream1.write(buffer1);
        stream3.read(buffer2);
        stream1.write(buffer2);

        stream1.close();
        stream2.close();
        stream3.close();
    }
}
