package day17_CustomClass;

public class Dog {

    //we do not need main method because this class is created as a blueprint of objects
   //First we will create instance variables:

    public String name;
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    //All objects have to be different names because every single memory has its own memory
    // name breed size age color these are attributes(fields)


    // when we create instance methods we do not give static specifier, to make sure each object has its own method
    // if you want a separate copy of attributes for each object you need to make the methods-instance- otherwise
    // the method will not be the object's own method

    //now we will create a setInfo,eat,drink, toString methods. These are all instance methods

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name; // 'this' keyword is used for calling the instance variable name. (Max,Loki gibi)
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;

    }

    public void eat() {  //if it is needed you can give parameters too
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking water ");

    }

    public String toString() {   //to avoid getting a hash-code
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }





}
