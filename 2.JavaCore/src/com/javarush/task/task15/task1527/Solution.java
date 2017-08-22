package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<String, String>();
        String s = "";

        String str = sc.nextLine(); //"http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
        String sub = str.substring(str.indexOf( '?' ) + 1, str.length());
        //System.out.println(sub);
        String[] arr = sub.split("&");
        for(int i=0;i<arr.length;i++)
        {
            //System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            String[] array = arr[i].split("=");
            try {
                map.put(array[0], array[1]);
            } catch (Exception e) {
                map.put(array[0], null);
            }
            s += array[0];
            if (i >= 0)
                s += " ";
        }

        System.out.println(s);

        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals("obj")) {
                try {
                    alert(Double.parseDouble(pair.getValue()));
                } catch (Exception e) {
                    alert(pair.getValue());
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
