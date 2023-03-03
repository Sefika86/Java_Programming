package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {



        Person person2 = new Person("Jess", 33, 'M', LocalDate.of(2023,12,3));

        System.out.println(person2);

        Person person1 = new Person("Jessica", 23, 'G', LocalDate.of(2021,12,3));

        System.out.println(person1);

    }
}
