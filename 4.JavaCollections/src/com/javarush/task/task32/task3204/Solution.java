package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.Random;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "1234567890";


        for (int i = 0; i < 4; i++)
            password.append( letters.charAt(random.nextInt(26)) );

        for (int i=0; i<2; i++)
            password.append( digits.charAt(random.nextInt(10)) );

        for (int i=0; i<2; i++)
            password.append( letters.toUpperCase().charAt(random.nextInt(26)) );


        try {
            output.write(password.toString().getBytes());
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return output;
    }
}