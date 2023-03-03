package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1, 25));

        System.out.println(person);

        //WE ARE NOT ABLE TO SET GENDER, AGE, ...BECAUSE THOSE VARIABLES ARE FINAL
        //THE ONLY SETTER IS NAME


        System.out.println("---------------------------------------------------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 2, 5), "Accountant", 100000);

        System.out.println(employee);

        employee.breath();

        System.out.println("---------------------------------------------------------------------");


        Student student = new Student("Sefika", 'F',LocalDate.of(1986,9,28), "Cydeo", 'A', LocalDate.of(2023,4,25), LocalDate.of(2022,9,25));

        System.out.println(student);

        student.study();

        student.sleep();


    }
}
