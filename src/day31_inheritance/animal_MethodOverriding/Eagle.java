package day31_inheritance.animal_MethodOverriding;

public class Eagle extends Animal{



    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + " is eating snake.");
    }


   //we do not need to override the toString method because we do not have additional variables in this subclass
}
