package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(args[0]);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int temp = 0;

        while (fileReader.ready()) {
            temp = fileReader.read();
            if (map.containsKey(temp) )
                map.put(temp, map.get(temp) + 1);
             else
                map.put(temp, 1);
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet())
            System.out.println((char)(int)pair.getKey() + " " + pair.getValue());

        fileReader.close();

        /*FileReader fileReader = new FileReader("/home/drake/IntToChar.txt");

        System.out.println((char)fileReader.read());*/
    }
}
