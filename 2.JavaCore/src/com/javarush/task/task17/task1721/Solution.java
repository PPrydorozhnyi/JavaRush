package com.javarush.task.task17.task1721;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String firstLine = scanner.nextLine();

        String secondLine = scanner.nextLine();

        readFromFile(firstLine, allLines);

        readFromFile(secondLine, forRemoveLines);

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

    }

    public static void readFromFile(String fileName, List<String> destination) {

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNext()) {

            destination.add(scanner.nextLine());

        }

    }

    public void joinData () throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {

            allLines.removeAll(forRemoveLines);

        } else {

            allLines.clear();
            throw new CorruptedDataException();

        }

    }
}
