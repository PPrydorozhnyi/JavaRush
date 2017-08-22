package com.javarush.task.task18.task1812;

import java.io.*;
import java.util.Scanner;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream outputStream;

    public QuestionFileOutputStream(AmigoOutputStream stream) {
        this.outputStream = stream;
    }

    @Override
    public void flush() throws IOException {
        outputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        outputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы действительно хотите закрыть поток? Д/Н");

        String string = scanner.nextLine();
        scanner.close();

        if ("Д".equals(string))
            outputStream.close();
    }

}

