package com.javarush.task.task14.task1421;

/**
 * Created by drake on 09.02.17.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}
