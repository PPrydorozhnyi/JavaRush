package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);

        String first, second;
        byte temp;

        first = scanner.nextLine();
        second = scanner.nextLine();

        FileInputStream fileInputStream = new FileInputStream(first);
        FileOutputStream fileOutputStream = new FileOutputStream(second);

        byte[] buffer = new byte[fileInputStream.available()];

        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }

        fileInputStream.close();

        for (int i = buffer.length - 1; i >= 0; i--) {

            /*temp = buffer[i];
            buffer[i] = buffer[buffer.length- 1 - i];
            buffer[buffer.length - 1 - i] = temp;*/
            fileOutputStream.write(buffer[i]);

        }

        //fileOutputStream.write(buffer);
        fileOutputStream.close();

    }
}

