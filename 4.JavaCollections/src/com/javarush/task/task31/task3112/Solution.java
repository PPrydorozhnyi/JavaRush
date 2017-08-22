package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("http://www.sample-videos.com/text/Sample-text-file-10kb.txt", Paths.get("/home/drake/my"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }

        //System.out.println("https://www.amigo.com/ship/secretPassword.txt".substring("https://www.amigo.com/ship/secretPassword.txt".lastIndexOf('/')));
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method

        URL url = new URL(urlString);

        Path temp = Files.createTempFile("tempp-", ".tmp");

        Files.copy(url.openStream(), temp, StandardCopyOption.REPLACE_EXISTING);

        String fieName = urlString.substring(urlString.lastIndexOf("/"));
        Path destPath = Paths.get(downloadDirectory.toString(), fieName);
        Files.move(temp,destPath);

        return destPath;


    }
}
