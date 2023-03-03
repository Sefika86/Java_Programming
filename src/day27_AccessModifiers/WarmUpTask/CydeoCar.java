package day27_AccessModifiers.WarmUpTask;

import day34_abstraction.animalTask.Flyable;
import day34_abstraction.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable, AutoPilot, Swimmable, Electric{


    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }



    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void charge() {

    }
}
