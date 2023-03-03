package day27_AccessModifiers.day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {


        //muhtar:"I want you to create 2 employee objects"

Employee e1 = new Employee("Daniel", 32, 'M', "Java Developer", 95000, LocalDate.of(2022,12,02) );

Employee e2 = new Employee("Mohammad", 31,'M', "Project Manager", 120000, LocalDate.of(2021,05,19));

//as you see we just used our 2 argument constructor method that we created in Employee class ,
// and we did not need the setInfo method anymore




    }
}