package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        FileInputStream f = new FileInputStream(reader.nextLine());

        int min, value;
        min = value= 128;
        while (f.available() > 0) {
            value = f.read();
            if (value < min)
                min = value;

        }
        f.close();
        System.out.println(min);
    }
}