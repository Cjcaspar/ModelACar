package com.company;
import java.util.Scanner;


public class MainMenu {
    Scanner scan = new Scanner(System.in);

    public void createCar() {
        System.out.println("What type of car would you like to create?");
        System.out.println("1. custom car \n 2. Ready to go\n 3. Exit");

        try {
            switch (scan.nextInt()) {
                case 1:
                    Car car = new Car();
                    car.getCarInfo();
                    Menu(car);
                    break;
                case 2:
                    Lexus lexus = new Lexus("Lexus", "GS 350", 2006, 0, 100, "Black");
                    lexus.getCarInfo();
                    Menu(lexus);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 3");
                    createCar();
            }
        }
            catch (Exception e){
            System.out.println("Please enter a number between 1 and 3");
            createCar();
        }


    }

    public void Menu(Car car) {
        System.out.println("What would you like to do now?");
        System.out.println("1. Speed up\n 2. Slow down\n3. Fill up with gas\n 4. Exit");
        try {
            switch (scan.nextInt()) {
                case 1:
                    car.setSpeed(car.getSpeed() + 4);
                    car.setGas(car.getGas() - car.getSpeed());
                    CarStatus(car);
                    break;
                case 2:
                    car.setSpeed(car.getSpeed() -4);
                    car.setGas(car.getGas() - car.getSpeed());
                    CarStatus(car);
                    break;
                case 3:
                    car.setGas(100);
                    CarStatus(car);
                    break;
                case 4:
                    System.exit(0);
                    break;

                    default:
                    System.out.println("Please enter a number between 1 and 3");
                    createCar();
            }
        }
        catch (Exception e){
            System.out.println("Please enter a number between 1 and 3");
            createCar();
        }


    }

    public void CarStatus(Car car) {
        System.out.println("Your car is going " + car.getSpeed() + " and has " + car.getGas() + " gas left.");
    }
}


