package com.company;
import java.util.Scanner;

public class Car {

    private String make;
    private String model;
    private int year;
    private int speed;
    private int gas;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public Car(String make, String model, int year, int speed, int gas) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.gas = gas;
    }

    public Car() {
        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGas(100);
    }


    public String getMake() {
        return make;
    }

    public void setMake() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        make = scan.nextLine();
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        model = scan.nextLine();
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        year = scan.nextInt();
        scan.nextLine();
    }

    public void getCarInfo() {
        System.out.println("Your car make is: " + getMake());
        System.out.println("Your car model is: " + getModel());
        System.out.println("Your car year is: " + getYear());
    }


}
