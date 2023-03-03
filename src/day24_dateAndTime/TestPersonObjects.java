package day24_dateAndTime;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPersonObjects {
    public static void main(String[] args) {
    //first create your person object with Arrays==> with 5 elements

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Helen", 'F', LocalDate.of(1986,6,28));
        people[2].setInfo("Jimmy", 'M', LocalDate.of(2001,12,2));
        people[3].setInfo("Jessica", 'F', LocalDate.of(1990,5,23));
        people[4].setInfo("Melissa", 'F', LocalDate.of(1983,8,12));




        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people) );
        System.out.println(studentList);

        System.out.println("=================================================");
        //homework
        //1-print name and date of birth for each object

        for (Person each : studentList) {
            System.out.println(each.name + " " + each.dateOfBirth);
        }

        //2-remove all the person objects that has the age older than 35.


        studentList.removeIf(p-> p.age > 35);
        System.out.println(studentList);

        System.out.println("--------------------------------------------------------");


        // remove all the person object that has the age>35
        studentList.removeIf(each->each.age>35);
        for (Person each : studentList) {
            System.out.println(each.name+" : "+each.dateOfBirth);
        }


















    }
}
