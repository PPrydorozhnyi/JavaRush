package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        /*Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        //String name = ;

        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());

        while (fileInputStream.available() > 0)
            list.add(fileInputStream.read());

        fileInputStream.close();

        Collections.sort(list);

        int i = 0, j = list.size() - 1;

        while (i != j) {

            if (list.get(i) == list.get(i + 1)) {
                list.remove(i + 1);
                j = list.size() - 1;
            } else
                ++i;

        }

        for (int number : list) {
            System.out.print(number + " ");
        }*/

        Scanner scn = new Scanner(System.in);
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        String filename = scn.nextLine();

        FileInputStream fileInputStream = new FileInputStream(filename);

        while (fileInputStream.available()>0)
        {
            Integer k = fileInputStream.read();
            treeMap.put(k, 1);
        }

        for (Map.Entry e : treeMap.entrySet())
        {
            System.out.print(e.getKey()+" ");
        }

        fileInputStream.close();
    }
}
