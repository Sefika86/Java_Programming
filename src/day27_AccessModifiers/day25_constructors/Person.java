package day27_AccessModifiers.day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    //first I create the instance variables with required attributes(fields):

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    //then I crete the constructor methods with 6 parameters.
    //I have to use this. keyword if local variable names are same as instance variable names.


    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    //I created toString method and format the dateOfBirth manually
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("dd/MM/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    //then I created 3 instance methods. ==>eat() and drink() are return methods, sleep() is a void method
    public String eat(String food){ //if food local variable was an instance variable name as well we have to use this. keyword
        return name + " loves eating " + food;
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String drink(String drink){
        return name + " loves drinking " + drink;
    }

}
/*
Requirements:
1. attributes: name, age, gender, dateOfBirth , isMarried, isEmployed
2. Add a constructor that can set all the fields (attributes) once an object is created.
3. toString(), eat(String food), sleeping(), drink(String drink)
4. format the dateOfBirth (dd/MM/y) inside the toString method

 */