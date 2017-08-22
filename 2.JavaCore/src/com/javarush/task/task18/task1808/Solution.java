package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream1, fileOutputStream2;
        int amount = 1, part = 0;

        String first, second, third;

        first = scanner.nextLine();
        second = scanner.nextLine();
        third = scanner.nextLine();

        scanner.close();


            fileInputStream = new FileInputStream(first);
            fileOutputStream1 = new FileOutputStream(second);
            fileOutputStream2 = new FileOutputStream(third);


        amount = fileInputStream.available();
        byte[] buffer = new byte[amount];

        while (fileInputStream.available() > 0)
            fileInputStream.read(buffer);
            fileInputStream.close();


        part = (int)Math.ceil(amount / 2);

        fileOutputStream1.write(buffer, 0, part);
        fileOutputStream1.close();

        fileOutputStream2.write(buffer, part, amount - part);
        fileOutputStream2.close();
    }
}

