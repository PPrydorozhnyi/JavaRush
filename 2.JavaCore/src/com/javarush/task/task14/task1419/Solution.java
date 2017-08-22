package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
            String s = null;
            s.equals("abc");
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            int[] a = new int[2];
            int b = a[4];
        } catch (Exception e ){
            exceptions.add(e);
        }

        try {
            ArrayList<Integer> eps = new ArrayList<Integer>();
            eps.add(3);
            int r = eps.get(9);
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            ArrayList<Integer> eps = new ArrayList<Integer>();
            eps.add(3);
            int r = eps.get(9);
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            ArrayList<Integer> eps = new ArrayList<Integer>();
            eps.add(3);
            int r = eps.get(9);
        } catch (Exception e){
            exceptions.add(e);
        }
        try {
            ArrayList<Integer> eps = new ArrayList<Integer>();
            eps.add(3);
            int r = eps.get(9);
        } catch (Exception e){
            exceptions.add(e);
        }
        try {
            ArrayList<Integer> eps = new ArrayList<Integer>();
            eps.add(3);
            int r = eps.get(9);
        } catch (Exception e){
            exceptions.add(e);
        }
        try {
            ArrayList<Integer> eps = new ArrayList<Integer>();
            eps.add(3);
            int r = eps.get(9);
        } catch (Exception e){
            exceptions.add(e);
        }
        try {
            ArrayList<Integer> eps = new ArrayList<Integer>();
            eps.add(3);
            int r = eps.get(9);
        } catch (Exception e){
            exceptions.add(e);
        }
    }
}
