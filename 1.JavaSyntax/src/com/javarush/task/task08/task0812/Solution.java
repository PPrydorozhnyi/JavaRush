package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int num = 1;
        int max = 1;

        for (int i = 0; i < 10; i++) {
            ar.add( sc.nextInt());
        }

        for (int i = 0; i < ar.size() - 1; i++) {
            if (ar.get(i).equals( ar.get(i + 1) ) ) {
                num++;
            } else if (num > max){
                max = num;
                num = 1;
            }
        }

        if (num > max)
            max = num;

        System.out.println(max);

    }
}