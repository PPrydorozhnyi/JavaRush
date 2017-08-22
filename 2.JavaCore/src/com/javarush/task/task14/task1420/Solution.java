package com.javarush.task.task14.task1420;

/* 
НОД
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println(nod(init(sc), init(sc)));
    }

    public static int init (Scanner sc){

        while (true)
        try{
            int a = sc.nextInt();

            if (a <= 0)
                throw new NumberFormatException();
            else
                return a;
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int nod(int a, int b){

        int t;

        /*System.out.println(a);
        System.out.println(b);*/

        if (a < b){
            t = a;
            a = b;
            b = t;
        }

        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }

        return Math.abs(a);
    }
}
