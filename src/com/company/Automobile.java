package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {
    double gasMilage;
    double gasTank;

    public Automobile(double mpg){
        gasMilage = mpg;
        gasTank = 0;
    }

    public void fillUp(double f)
    {
        gasTank += f;
    }

    public void takeTrip(double m)
    {
        gasTank -= (m/gasMilage);
    }

    public double reportFuel()
    {
        return gasTank;
    }
}

