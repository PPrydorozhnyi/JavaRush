package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>(15);
        Scanner sc = new Scanner(System.in);
        int[] leng = new int[15];
        int max = 0, min = 0;

        for (int i = 0; i < 15; i++) {
            str.add(sc.nextLine());
            leng[i] = str.get(i).length();
        }

        for (int i = 0; i < str.size(); i++)
            if (leng[i] > leng[max])
                max = i;
        else if (leng[i] < leng[min])
            min = i;

        if (min < max)
            max = min;

        System.out.println(str.get(max));
    }
}
