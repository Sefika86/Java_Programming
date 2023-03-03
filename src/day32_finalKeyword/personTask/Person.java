package day32_finalKeyword.personTask;

import java.security.PublicKey;
import java.time.LocalDate;

public class Person {

    private String name;          //this doesn't give compile error because it's already assigned to a default value

    private final char gender;

    private final int age;

    private final LocalDate dateOfBirth;    //these final instance variables are compile error until we create constructor

    public static final int numberOfHead;    //and this final static is compile error until we create static block


    static{
        numberOfHead = 1;
    }


    //WE CAN NOT CREATE SETTERS FOR FINAL INSTANCE VARIABLES, SO WE HAVE TO SET THEIR CONDITIONS IN THE CONST.

    public Person(String name, char gender, LocalDate dateOfBirth) {   //we don't need age as an argument
        setName(name);

        if (! (gender == 'M' || gender == 'F') ){
            System.err.println("Invalid gender: " +gender);
            System.exit(1);
        }
        this.gender = gender;

        this.dateOfBirth = dateOfBirth;

        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public char getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void eat(){
        System.out.println(name + " is eating.");
    }



    public void drink(){
        System.out.println(name + " is drinking.");
    }



    public void sleep(){
        System.out.println(name + " is sleeping.");
    }



    //to make sure this implementation will never change we made it ==> final (never be overridden)
    public final void breath(){
        System.out.println(name + " is breathing");
    }



    public String toString() {
        return getClass().getSimpleName() + " " +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth;
    }
}
/*

Variables:
    name, gender, age, dateOfBirth
    numberOfHead
Methods:
    eat(), drink(), sleep()
    breath()
 */