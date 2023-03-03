package day27_AccessModifiers.day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    // if you want to create employee objects with all same name, salary, gender etc ==> make static otherwise ==>
    // make instance variables;

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hired_Date;
//these are all instance variables we want to set for each employee

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hired_Date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hired_Date = hired_Date;
    } //this cons. method allows us to set all the instance variables of the object as soon as obj. is created


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hired_Date=" + hired_Date.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }// toString() has diff. purpose, it allows us to print objects when they passed in the print statement
     //we applied dateTimeFormatter manually in toString method








}
/*
these are the attributes Muhtar wants to set in our custom class:
name
age
gender
jobTitle
salary
hired_date
 */