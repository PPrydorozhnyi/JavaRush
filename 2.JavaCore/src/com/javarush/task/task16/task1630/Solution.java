package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        Scanner scanner = new Scanner(System.in);
        firstFileName = scanner.nextLine();
        secondFileName = scanner.nextLine();
        scanner.close();
    }


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();

    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface  {

        private String fileName;
        private Scanner scanner;
        String text;
        File file;

        @Override
        public void setFileName(String fullFileName) {
            try {
                scanner = new Scanner(new File(fullFileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String getFileContent() {
            return text;
        }

        @Override
        public void run() {

            text = scanner.nextLine();
            text += " " + scanner.nextLine();
            text += " " + scanner.nextLine();

            scanner.close();
        }

    }
}
