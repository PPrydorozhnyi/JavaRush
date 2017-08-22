package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {

        ArrayList<String> list = new ArrayList<String>();

        Queue<File> queue = new PriorityQueue<File>();

        File currentFile = new File(root);

        Collections.addAll(queue, currentFile.listFiles());

        while (!queue.isEmpty()) {
            currentFile = queue.remove();

            if (currentFile.isDirectory())
                Collections.addAll(queue, currentFile.listFiles());
            else
                list.add(currentFile.getAbsolutePath());

        }


        return list;

    }

    public static void main(String[] args) {
        
    }
}
