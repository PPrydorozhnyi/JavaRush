package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat format1 = new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH);
        //Scanner scanner = new Scanner(System.in);
        //String[] string = scanner.nextLine().split(" ");



        switch (args[0]) {

            case "-c":
                //method1
                if ("м".equals(args[3]))
                    allPeople.add(Person.createMale(args[2], format.parse(args[4])));
                 else
                    allPeople.add(Person.createFemale(args[2], format.parse(args[4])));
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                //method2
                if ("м".equals(args[3]))
                    allPeople.set(Integer.valueOf(args[2]) ,Person.createMale(args[2], format.parse(args[5])));
                else
                    allPeople.set(Integer.valueOf(args[2]) ,Person.createFemale(args[2], format.parse(args[5])));
                break;
            case  "-d":
                //method3
                allPeople.set(Integer.valueOf(args[2]), null);
                break;
            case "-i":
                //method4
                Person person = allPeople.get(Integer.valueOf(args[1]));
                System.out.println(person.getName() + " " + (person.getSex().equals(Sex.MALE) ? "м" : "ж" )+ " " + format1.format(person.getBirthDay()));
                break;
            default:
                System.out.println("Undefined input");

        }

        //scanner.close();

    }
}
