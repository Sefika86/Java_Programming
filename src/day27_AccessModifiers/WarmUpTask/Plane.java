package day27_AccessModifiers.WarmUpTask;

import day34_abstraction.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {

    //IMPORTANT: why did we make this subclass ==> abstract
    //because plane is a generic name ,so we can have multiple type of planes
    //if we made this subclass abstract too
    // then it is not a must to override abstract methods , plane inherits them from Transportation as they are


    //call the transportation constructor
    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel()+" is landing");
    }

    //non-abstract method, because common in all possible subclasses


    @Override
    public void fly() {
        System.out.println(getMake() +" "+ getModel() +" is flying");
    }
}
