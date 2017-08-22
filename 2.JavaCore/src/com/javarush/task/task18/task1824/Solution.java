package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String temp;
        LinkedList<FileInputStream> streams = new LinkedList<>();

        while (true) {

            temp = sc.nextLine();

            try {
                streams.add(new FileInputStream(temp));
            } catch (FileNotFoundException e) {

                System.out.println(temp);
                for (FileInputStream stream : streams) {
                    try {
                        stream.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                    break;
            }

        }
        sc.close();
    }
}
