package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = byteArrayOutputStream.toString();
        String[] resultArray = result.split(" ");

        System.setOut(printStream);

        if (resultArray[1].equals("+")) {
            System.out.print(resultArray[0]);
            System.out.print(" ");
            System.out.print(resultArray[1]);
            System.out.print(" ");
            System.out.print(resultArray[2]);
            System.out.print(" ");
            System.out.print("=");
            System.out.print(" ");
            System.out.print(Integer.parseInt(resultArray[0])+Integer.parseInt(resultArray[2]));}
        if (resultArray[1].equals("*")){
            System.out.print(resultArray[0]);
            System.out.print(" ");
            System.out.print(resultArray[1]);
            System.out.print(" ");
            System.out.print(resultArray[2]);
            System.out.print(" ");
            System.out.print("=");
            System.out.print(" ");
            System.out.print(Integer.parseInt(resultArray[0])*Integer.parseInt(resultArray[2]));}
        if (resultArray[1].equals("-")){
            System.out.print(resultArray[0]);
            System.out.print(" ");
            System.out.print(resultArray[1]);
            System.out.print(" ");
            System.out.print(resultArray[2]);
            System.out.print(" ");
            System.out.print("=");
            System.out.print(" ");
            System.out.print(Integer.parseInt(resultArray[0])-Integer.parseInt(resultArray[2]));}

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


