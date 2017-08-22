package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7

        String s;
        Scanner sc = new Scanner(System.in);
        
        boolean bool = false;

        while (true){
            s = sc.nextLine();



            Movie movie = MovieFactory.getMovie(s);

            if (!"thriller".equals(s) && !"soapOpera".equals(s) && !"cartoon".equals(s))
                break;

            System.out.println(movie.getClass().getSimpleName());

            /*switch(s){
                case "cartoon": movie = MovieFactory.getMovie(s);
                break;

                case "thriller": movie = new Thriller();
                break;

                case "soapOpera": movie = new SoapOpera();
                break;

                default: bool = true;
            }

            if (bool)
                break;*/
        }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("cartoon".equals(key))
                movie = new Cartoon();

            if ("thriller".equals(key))
                movie = new Thriller();

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{
    }
    static class Thriller extends Movie{}
    //Напишите тут ваши классы, пункт 3
}
