package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList array = new ArrayList();
        ArrayList<String> ar = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
            ar.add(reader.readLine());

        for (int i = 0; i < ar.size() - 1; i++)
            if (ar.get(i).length() > ar.get(i + 1).length())
                System.out.println(i + 1);
    }
}

