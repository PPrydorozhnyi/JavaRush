package com.javarush.task.task31.task3109;

import java.io.FileInputStream;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {

        Properties properties = new Properties();
        int position = fileName.lastIndexOf('.');
        String type = position >= 0 ? fileName.substring(position) : "";
        FileInputStream in;

        try {

            in = new FileInputStream(fileName);

            switch (type) {

                case ".xml":
                    properties.loadFromXML(in);
                    break;
                default:
                    properties.load(in);

            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            return properties;
        }

        return properties;
    }
}
