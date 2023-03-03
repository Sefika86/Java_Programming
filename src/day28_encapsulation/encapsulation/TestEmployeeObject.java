package day28_encapsulation.encapsulation;

import java.sql.SQLOutput;

public class TestEmployeeObject {

    public static void main(String[] args) {
/*
BEFORE HAVING A CONS METHOD IN EMPLOYEE CLASS;

        Employee employee1 = new Employee();

       // employee1.salary = -200000; is not a possible value ,so we will create getter and setter
       // in Employee class to add some conditions for our instance variable (salary)


        employee1.setSalary(100000);

        System.out.println(employee1.getSalary());


        employee1.setName("      ");
        System.out.println(employee1.getName());

 */
//AFTER HAVING CONST. IN EMPLOYEE CLASS

        Employee employee1 = new Employee("Khashayar", 45, "", 100000);
        System.out.println(employee1);  //Job title of the employee can not be empty or blank.

//object can not be created with that invalid jobTitle
    }
}
