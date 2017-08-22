package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                while (!currentThread().isInterrupted()) {

                    Thread.sleep(1000);
                    --countSeconds;

                }
            } catch (InterruptedException e) {
                if (countSeconds == 0)
                    System.out.println("3 2 1 Марш!");
                else
                    System.out.println("4 3 2 1 Прервано!");
            }
        }
    }
}
