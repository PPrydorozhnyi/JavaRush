package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> fileNames = new LinkedList<>();
        String temp = "";
        FileInputStream in;
        byte[] buffer = {0};

        while (true) {
            temp = sc.nextLine();

            if (!"end".equals(temp))
                fileNames.add(temp);
            else
                break;
        }

        Collections.sort(fileNames);

        /*for (String s : fileNames)
            System.out.println(s);

        //System.out.println(fileNames.getFirst());
        System.out.println(fileNames.getFirst().substring(0, fileNames.getFirst().lastIndexOf(".")));*/

        sc.close();

        FileOutputStream out = new FileOutputStream(fileNames.getFirst().substring(0, fileNames.getFirst().lastIndexOf(".")), true);

        for (String name : fileNames) {
            in = new FileInputStream(name);

            if (in.available() > 0) {
                buffer = new byte[in.available()];
                in.read(buffer);
            }
            in.close();
            out.write(buffer);
        }

        out.close();
    }
}
