package day31_inheritance.animal_MethodOverriding;

public class Cat extends Animal{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override  //this @Override is optional to write as long as you obey the rules of overriding
    public void eat(){  //if you use shortcut, delete super.eat() and add your own sout.
        System.out.println("Cat " + getName() + " is eating cat food.");

    }

    @Override
    public void drink() {
        System.out.println("Cat " + getName() + " is drinking milk and water" );
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " is sleeping 12 hours in a day");
    }


    //a unique method for all cats, it is not an overrode method
    public void scratch(){
        System.out.println("Cat " + getName() + " is scratching");
    }
}
