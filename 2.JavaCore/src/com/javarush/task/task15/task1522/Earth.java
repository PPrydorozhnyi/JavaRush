package com.javarush.task.task15.task1522;

/**
 * Created by drake on 20.02.17.
 */
public class Earth implements Planet {

    private Earth() {    }

    private static Earth instance;

    /*private static class EarthHolder {

        private final static Earth instance = new Earth();

    }*/

    public static Earth getInstance() {

        if (instance == null)
            instance = new Earth();

        return instance;

    }
}
