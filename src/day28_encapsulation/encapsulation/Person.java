package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;


    public Person(String name, int age, char gender, LocalDate DOB) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDOB(DOB);
    }

    public String getName() {
        if (name == null) {
            return "unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("The name of the person can not be empty or blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.err.println("age can not be less than zero or greater than 120");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != 'M' || gender != 'F') { //or you can do || ==> (!(gender == 'M' || gender == 'F'))
            System.err.println("gender can only be 'M' or 'F'");
        }
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        if ( DOB.isAfter(LocalDate.now()) ) {
            System.err.println("DOB can not be after today's date");
            System.exit(1);
        }
        this.DOB = DOB;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }
}

/*
Variables:
    name, age, gender, dateOfBirth
        name:
            Write: can not be null/empty/blank
            Read: if name is null, return "Unknown" instead
        age:
            Write: age can not be less than zero or greater than 120
        gender:
            Write: gender can only be 'M' or 'F'
        dateOfBirth:
            Write:  can not be after today's date
    Add a constructor that can set all the fields
    Add toString()
 */
