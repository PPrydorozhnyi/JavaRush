package com.javarush.task.task15.task1522;

/**
 * Created by drake on 20.02.17.
 */
public class Sun implements Planet {

    private Sun() {}

    private static Sun instance;

    /*private static class SunHolder {

        private final static Sun instance = new Sun();

    }*/

    public static Sun getInstance() {

        if (instance == null)
            instance = new Sun();

        return instance;

    }
}
