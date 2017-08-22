package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        try {
            FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
            while (fileInputStream.available() > 0) {
                if (fileInputStream.read() == 44)
                    ++counter;
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(counter);

    }
}
