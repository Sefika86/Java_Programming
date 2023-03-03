package day29_inheritance.animalTask;

public class Dog extends Animal {  //dog is An animal
    //      child        parent


    /*
    public void method() {
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);
        setInfo();
        eat();
        drink();
        sleep();
        toString();
        bark();
      }

     */






    public void bark(){

        System.out.println(getName() + " is barking");
    }




}
/*
7 variables
5 methods already inherited from Animal class by extend the sub(child) class to super(parent) class
 */


/*
1. Dog
			attributes: all are inherited from Animal

			methods: All many other methods are inherited from Animal(parent class)
					 bark()
 */