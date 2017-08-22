package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);

        if (!".txt".equals(fileExtension(fileName))) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    private String fileExtension(String fileName) {

        int index = fileName.lastIndexOf('.');
        return index == -1 ? null : fileName.substring(index);

    }

    public static void main(String[] args) {
        /*try {
            System.out.println(new TxtInputStream("/home/drake/kurwa.c").fileExtension("/home/drake/kurwa.c"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedFileNameException e) {
            e.printStackTrace();
        }*/
    }
}

