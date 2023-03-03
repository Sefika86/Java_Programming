package day32_finalKeyword.carTask;

public class Toyota extends Car {

    //child class can not inherit or override the constructor. We just called it from parent class
    public Toyota(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
}

/*
 1. Toyota
             start(): "Press the brake and twist the key to ignition"
 */