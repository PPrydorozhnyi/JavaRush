package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {

    static String fileName;
    static String pathToZip;
    static List<ZipEntry> list;

    public static void main(String[] args) throws IOException {

        fileName = args[0];
        pathToZip = args[1];

        list = readEntries();

        writeEntries(list);

    }

    private static void writeEntries(List<ZipEntry> list) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(pathToZip);
        ZipOutputStream out = new ZipOutputStream(fileOutputStream);
        File file = new File(fileName);


        ZipEntry entry = new ZipEntry("new/" + file.getName());

        for (ZipEntry zipEntry : list) {
            if (zipEntry.getName().equals(entry.getName()))
                continue;
            out.putNextEntry(zipEntry);
        }

        out.putNextEntry(entry);
        Files.copy(file.toPath(), out);

        out.close();
        fileOutputStream.close();
    }

    private static List<ZipEntry> readEntries() throws IOException {

        List<ZipEntry> zipEntries = new ArrayList<ZipEntry>();

        FileInputStream fileInputStream = new FileInputStream(pathToZip);
        ZipInputStream in = new ZipInputStream(fileInputStream);

        while (in.available() > 0) {
            zipEntries.add(in.getNextEntry());
        }

        in.close();
        fileInputStream.close();

        return zipEntries;
    }
}
