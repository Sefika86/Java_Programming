package day29_inheritance.animalTask;

public class Cat extends Animal {

    // we do not create all those inherited variables and methods from Animal class,
    // we inherit them from Animal class by using extends keyword

    public void meow(){
        System.out.println(getName() +" is meowing");
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }




}

/*
2. Cat
			attributes:


			methods:
				meow(), scratch()
 */