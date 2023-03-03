package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
    //    tiger.hunt();

//eat, drink sleep can be called by tiger object because they exist in Animal class but hunt can not be called because it was in tiger class
        //a method must be in reference type not in object type to be able to called


        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black");
       // animal.fly();
        animal.sleep();
        animal.eat();
        animal.drink();


        Flyable obj1 =new Eagle("John", "American Eagle", 'M', 3, "Small", "Black");
       // obj1.eat();
        // obj1.sleep();
        //obj1.drink();    //these methods were not in ref type(Flyable)

        obj1.fly();        //but this fly() method was created in Flyable interface(reference type)
        System.out.println(obj1.canFly);

        System.out.println("----------------------------------------------------------------------");
//Local variables have to be instantiated before using
        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;



  //      ref type            obj type
        Flyable[] birds = {parrot, eagle, duck};

        Swimmable[] fishes = {dolphin, shark, duck};

        Playable[] friendlyAnimals = {dolphin, dog, cat};

//we can add any object in this array if there is an is a relationship between obj type and ref type
//This is the only way we can implement POLYMORPHISM


        System.out.println("-----------------------------------------------------------------");


//instanceof keyword: helps us to checy if there is an is a relationship between obj and ref type

       // boolean isAnimal = cydeoCar instanceof Animal;    ==> compile error

        boolean isAnimal = dog instanceof Animal;
        System.out.println(isAnimal);         //  true;


        System.out.println("--------------------------------------------------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;


        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);

        System.out.println("------------------------------------------------");







    }
}
