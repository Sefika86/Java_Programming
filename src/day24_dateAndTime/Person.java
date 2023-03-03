package day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

//these above are local variables
// when we generate the setInfo method we do not need to include the age
// because we can calculate the age with dateOfBirth and currentDate

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }


    //we added age after generating the setInfo, and if a parameter does not have the same name with the
        // instance variable ,we do not need this keyword


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
