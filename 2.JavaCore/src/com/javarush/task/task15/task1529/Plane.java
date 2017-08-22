package com.javarush.task.task15.task1529;

/**
 * Created by drake on 22.02.17.
 */
public class Plane implements Flyable {

    int passengers;

    public void fly(){}

    public Plane(int passengers) {
        this.passengers = passengers;
    }
}
