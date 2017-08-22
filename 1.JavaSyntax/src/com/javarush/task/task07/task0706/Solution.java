package com.javarush.task.task07.task0706;

import java.io.IOException;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        int counter = 0;

        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();

        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                counter++;
            else  counter --;

        if (counter > 0)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
