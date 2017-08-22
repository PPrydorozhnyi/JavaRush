package com.javarush.task.task14.task1417;

/**
 * Created by drake on 07.02.17.
 */
public class USD extends Money {
    @Override
    public String getCurrencyName(){
        return "USD";
    }

    public USD(double amount){
        super(amount);
    }
}
