package com.company;

class Lexus extends Car {

    private String color;

    public Lexus (String make, String model, int year, int speed, int gas, String color) {
        super(make, model, year, speed, gas);
        this.color = color;
    }

    public void getCarInfo() {
        System.out.println("Your car make is: " + getMake());
        System.out.println("Your car model is: " + getModel());
        System.out.println("Your car year is: " + getYear());
    }



}
