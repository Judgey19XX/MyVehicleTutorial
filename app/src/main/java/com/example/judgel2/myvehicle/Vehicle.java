package com.example.judgel2.myvehicle;

/**
 * Created by judgel2 on 10/10/2017.
 * @author Liam Judge
 * @version 1.1
 */

public class Vehicle {

    public static int counter = 0;
    private String make;
    private int year;
    private String message;
    // the default constructor
    public Vehicle() {
        this.make = "Volvo";
        this.year = 2012;
        this.message = "This is the default message.";
    }
    /*
    * This constructor takes two parameters
    */
    public Vehicle(String make, int year){
        this.make = make;
        this.year = year;
        this.message = "Your car is a " + make + " built in " + year + ".";
        count();
    }

    /**
     * The constructor that takes the make of the car.
     * @param make the make of your car.
     */
    public Vehicle(String make){
        this();
        this.make = make;
        message = "You didn't type in the year value.";
        count();
    }

    private void count(){
        this.counter++;
    }

    @Override
    public String toString() {
        return message;
    }

    public String getMessage() {
        return message;
    }
}


