package day30_inheritance.typesOfInheritance;


import java.time.LocalDate;

public class Person {    //super (parent) class

    private String name;          //these private variables are not accessible in other classes
    private int age;
    private char gender;
    private LocalDate DOB;

//constructor
    public Person(String name, char gender, LocalDate DOB) {
        setName(name);                                       //after we generated const. we switch those this. keywords to set method
        setGender(gender);
        setDOB(DOB);
        setAge(LocalDate.now().getYear() - DOB.getYear());   //we did not add age, we will calculate it with DOB
    }



    public String getName() {         //but these public getter and setters are accessible
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {    //let's add a condition in age setter method.
        if(age <= 0){
            System.err.println("Age can not be zero or negative.");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }


    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }


    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }


    //toString

    public String toString() {
        return getClass().getSimpleName() +"{" +  //do not forget to concatenate getClass().getSimpleName() in toString
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }
}
