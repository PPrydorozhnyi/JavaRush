package com.javarush.task.task15.task1522;

/**
 * Created by drake on 20.02.17.
 */
public class Moon implements Planet {

    private Moon() {}

    private static Moon instance;

    /*private static class MoonHolder {

        private final static Moon instance = new Moon();

    }*/

    public static Moon getInstance() {

        if (instance == null)
            instance = new Moon();

        return instance;

    }
}
