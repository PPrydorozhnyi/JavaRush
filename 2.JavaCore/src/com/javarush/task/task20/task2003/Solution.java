package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.*;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties prop = new Properties();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        sc.close();

        FileInputStream fs = new FileInputStream(s);

        load(fs);

        fs.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод

        prop.clear();

        for (Map.Entry<String, String> pair : properties.entrySet()) {
            prop.put(pair.getKey(), pair.getValue());
        }

        prop.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод

        prop.load(inputStream);

        for (Map.Entry<Object, Object> pair : prop.entrySet()) {
            properties.put((String)pair.getKey(), (String)pair.getValue());
        }

    }

    public static void main(String[] args) {

    }
}
