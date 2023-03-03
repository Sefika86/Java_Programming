package day27_AccessModifiers.day25_constructors;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        //Let's create 2 person objects and give the parameters with the constructor method that we created in Person class
        //each object does not affect the other one because every single object has its own memory

        Person p1 = new Person("Daniel", 35, 'M', LocalDate.of(1987,9,28), true,true);

        Person p2 = new Person("Jessica", 34, 'F', LocalDate.of(1988,10,10), false, true);


        String p1Eat = p1.eat("fish");
        System.out.println(p1Eat);

        String p2Drink = p2.drink("tea");
        System.out.println(p2Drink);

        p1.sleep();







    }
}
