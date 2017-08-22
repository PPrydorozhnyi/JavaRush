package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        BigInteger result = BigInteger.ONE;
        //String s = n + "! = factorial(" + n + ") = ";
        //String s = "";

        if (n >= 0 && n <= 150) {

            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
                /*if (i < n)
                    s += i + "*";
                else s += i;*/
            }

            return /*n + "! = factorial(" + n + ") = " + s + " = " + */String.valueOf(result);
        } /*else if (n == 0)
            return "0! = 1";*/

        return "0";
    }
}
