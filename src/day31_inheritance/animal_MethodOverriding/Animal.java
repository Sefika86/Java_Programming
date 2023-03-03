package day31_inheritance.animal_MethodOverriding;

public class Animal {  //parent class


    //In this class we only include common features for all animals.

    private String name, breed;
    private char gender;
    private int age;
    private String size, color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //we create some common actions for all animals but different animals eat,drink,sleep different
    //So we have to OVERRIDE these methods in subclasses
    // if methods are static, private or final ==> THEY CAN NOT BE OVERRODE
    //IF WE HAVE PARAMETERS, THEY MUST BE SAME IN OVERRODE METHOD IN SUBCLASS(If parameters are different, that means overloading)


    public void drink(){
        System.out.println(name+" is drinking water");
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name +" sleeps 8 hours");
    }

    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
