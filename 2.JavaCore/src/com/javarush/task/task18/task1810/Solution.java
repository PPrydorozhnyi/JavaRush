package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        Scanner scanner = new Scanner(System.in);
        FileInputStream file;
        String s;

        while (true) {

            s = scanner.nextLine();
            file = new FileInputStream(s);

            if (file.available() < 1000) {
                file.close();
                throw new DownloadException();
            }

        }


    }

    public static class DownloadException extends Exception {

    }
}
