package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String full = fileScanner.nextLine();
            String[] parts = full.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(parts[5]),
                    Integer.parseInt(parts[4]) - 1,
                    Integer.parseInt(parts[3]));
            return new Person(parts[1], parts[2], parts[0], calendar.getTime());
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
