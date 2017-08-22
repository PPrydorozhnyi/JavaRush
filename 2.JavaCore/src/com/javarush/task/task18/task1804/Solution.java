package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

       /* Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine() *//*"/home/drake/kurwa.c"*//*;
        scanner.close();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();


        FileInputStream fileInputStream = new FileInputStream(name);

        int currentByte = 0;
        StringBuilder string = new StringBuilder();

        while (fileInputStream.available() > 0) {

            currentByte = fileInputStream.read();
            if ( map.containsValue(currentByte) ) {
                map.put(currentByte, map.get(currentByte) + 1);
            }
            else {
                map.put(currentByte, 1);
            }
        }

        fileInputStream.close();
        int min = map.entrySet().iterator().next().getValue();


        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {

            if (min > pair.getValue())
                min = pair.getValue();

        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {

            if (min == pair.getValue()) {
                string.append(pair.getKey());
                string.append(" ");
            }

        }

        System.out.println(string);*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file);

        Map<Integer, Integer> map = new HashMap<>();

        while(inputStream.available() > 0){
            int x = inputStream.read();
            Integer frequency = map.get(x);
            map.put(x, frequency == null ? 1 : frequency + 1);
        }

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(1)){
                System.out.print(entry.getKey() + " ");
            }
        }

        reader.close();
        inputStream.close();
    }
}
