package day27_AccessModifiers.WarmUpTask;

public abstract class Car extends Transportation {


    //IMPORTANT: why did we make this subclass ==> abstract
    //because car is a generic name ,so we can have multiple type of cars
    //if we made this subclass abstract too
    // then it is not a must to override abstract methods , car inherits them from Transportation as they are



    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    public void drive() {
        System.out.println("Driving "+ getMake() +" "+getModel());       //non-abstract method, common in all possible subclasses
    }
}
