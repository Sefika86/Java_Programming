package day17_CustomClass;

public class Employee {

    //First you need to think what info you would like to store in your instance variables
    //Why instance , because each object they need to have a separate copy for itself


//These are 6 different attributes(fields) in this employee class:
    public String name; // right now we do not assign any value bc we will do it when we create the object
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String id;

// now in order to set these attributes it's easier to create instance methods:
// shortcut for setInfo method==> right click ==> constructor ==> choose your attributes with ctrl ==> OK
// we didn't learn construction yet so delete the class name and write void setInfo

    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

//setInfo sets all the attributes of the Employee object at once

// we have to generate toString method to for preventing hashcode

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }


    public void work() {
        System.out.println(name + " is working");
    }










}
