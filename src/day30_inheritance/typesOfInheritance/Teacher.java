package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee {

  // The richest class is teacher class in this package, the poorest is person class
  //this is a grandchild class == > multi-level inheritance
  //Teacher class has is a relationship both with Person & Employee class.
  //but does not have is a relationship with president & student class


    //constructor called from
    public Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, gender, DOB, jobTitle, employeeId, salary);
    }



    public void teach(){
        System.out.println(getName() + " is teaching");
    }



}
