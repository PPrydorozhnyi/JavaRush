package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());


        HashMap<Integer, Integer> map = new HashMap<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            map.put(data, (map.containsKey(data) ? map.get(data) + 1 : 1));
        }

        int count = 0;

        for (HashMap.Entry<Integer, Integer> me : map.entrySet()) {
            if (count < me.getValue()) {
                count = me.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == count) {
                System.out.print(pair.getKey() + " ");
            }
        }
        inputStream.close();
    }
}

