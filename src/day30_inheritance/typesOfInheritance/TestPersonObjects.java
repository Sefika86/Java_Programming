package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {


        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5, 16), 'A', "A01");

        President president = new President("Daniel", 'M', LocalDate.of(1980, 12, 1),LocalDate.of(2020, 1, 1));

        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(1985, 11, 1), "Math Teacher", "C1", 95000);


        System.out.println(student);   //Student{name='Lucy', age=32, gender=F, DOB=1990-05-16}
        System.out.println(teacher);   //Teacher{name='Emily', age=37, gender=F, DOB=1985-11-01}
        System.out.println(president); //President{name='Daniel', age=42, gender=M, DOB=1980-12-01}

        //we see only name,age,gender,DOB depending on toString we have in Parent class
        //if we want to have child classes unique variables as well, we need to override toString method (in day31)

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("---------------------------------------------------");

        student.eat("Baklava");
        teacher.eat("Kebab");
        president.eat("Donut");

        student.drink("Milk");
        teacher.drink("Tea");
        president.drink("Coffee");




    }
}
