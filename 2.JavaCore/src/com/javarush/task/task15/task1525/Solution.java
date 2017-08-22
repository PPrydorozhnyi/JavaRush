package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    //public static String FILE_NAME = "/media/drake/Hard/Project2/text/text.txt";

    static {

        try {
            Scanner sc = new Scanner(new File(Statics.FILE_NAME));

            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
