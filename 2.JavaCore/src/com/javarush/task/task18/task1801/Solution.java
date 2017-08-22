package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        FileInputStream f = new FileInputStream(reader.nextLine());

        int max, value;
        max = value= 0;
        while (f.available() > 0) {
            value = f.read();
            if (value > max)
                max = value;

        }
        f.close();
        System.out.println(max);
    }
}
