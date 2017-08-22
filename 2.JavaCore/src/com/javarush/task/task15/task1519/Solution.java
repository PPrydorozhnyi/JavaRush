package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner sc = new Scanner(System.in);
        String s;

        while (true) {

            s = sc.nextLine();

            if ("exit".equals(s))
                break;
            if (isNuber(s)) {

                if (-1 != s.indexOf('.')) {
                    print(Double.parseDouble(s));
                }
                else {

                    int temp = Integer.parseInt(s);

                    if (0 < temp && temp < 128)
                        print((short) temp);
                    else
                        print(temp);
                }



            } else
                print(s);

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

    public static boolean isNuber (String s) {

        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
