package com.javarush.task.task14.task1417;

/**
 * Created by drake on 07.02.17.
 */
public class Hrivna extends Money {
    @Override
    public String getCurrencyName(){
        return "HRN";
    }

    public Hrivna(double amount){
        super(amount);
    }

    /*public double getAmount(){
        return super.getAmount();
    }*/
}
