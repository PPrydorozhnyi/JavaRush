package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Проход по дереву файлов
*/
public class Solution {

    private static File path;
    private static File resultFileAbsolutePath;
    private static File allFilesContent;
    private static String writeTo;
    private static List<File> files = new ArrayList<File>();

    public static void main(String[] args) throws IOException {

        path = new File(args[0]);
        resultFileAbsolutePath = new File(args[1]);

        allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);

        loop();
    }

    public static void loop() throws IOException {

        for (File file : path.listFiles())
            if (file.length() > 50)
                FileUtils.deleteFile(file);
            else
                files.add(file);

        //FileUtils.renameFile(resultFileAbsolutePath, new File(writeTo));

        files.sort(new Comparator<File>() {
            @Override
            public int compare(File file1, File file2) {
                return file1.getName().compareTo(file2.getName());
            }
        });

        FileOutputStream out = new FileOutputStream(allFilesContent);

        writeToFile(out);

        out.close();

    }

    public static void writeToFile(FileOutputStream out) throws IOException {

        FileInputStream in;

        for (File file : files) {
            in = new FileInputStream(file);

            while (in.available() > 0) {
                out.write(in.read());
            }

            out.write(System.lineSeparator().getBytes());
            out.flush();

            in.close();
        }

    }

    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
}