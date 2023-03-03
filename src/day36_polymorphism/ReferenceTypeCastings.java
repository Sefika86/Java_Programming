package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.Iphone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;


public class ReferenceTypeCastings {

    public static void main(String[] args) {


        //upcasting:

        Dog dog = new Dog();

        Animal animal1 = new Dog();   //polymorphism ==> no error because of upcasting (implicit casting)

        //is an example of upcasting, so we are able to call ref types methods (setInfo)

        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();     //I can call these too, because they are in Animal class (upcasting)


        //  animal1.bark();  //but I can not call this, so we have to do downcasting


        //downCasting: we will explicitly cast larger ref type (animal1) to smaller ref type (Dog)

        ((Dog) animal1).bark();    //==> downcasting

        //or

        //  Dog dog1 = (Dog)animal1; // down casting
        //   dog1.bark();


        //  ( (Cat)animal1).scratch(); // Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat
        //animal1 object is referencing a dog object right now, so we can not downCasting animal1 to a Cat obj

        System.out.println("-------------------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Blue", 350);

        phone.call(911);
        phone.text(123456);
        // phone.selfDefense();    // compile error because this is nokia's method, not the Phone parent's

        ((Nokia) phone).selfDefence();  //but if we do downCasting , no compile error


        //   ((IPhone) phone).faceTime(123456789);  //ClassCastException,
        //  because
        //  Nokia can not be converted to IPhone, because there is not "IS A" relationship between Nokia and IPhone


        System.out.println("-------------------------------------------------------------");


        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        ((Developer) employee).getProgrammingLanguage();  //downCasting

        System.out.println(((Developer) employee).getProgrammingLanguage());


        //    Driver driver = (Driver) employee;   --> ClassCastException
        //    this downCasting does not work because there is no is a relationship between driver and developer

        System.out.println("-------------------------------------------------------------");

//     parent interface is ref type      and Tesla is its child as an obj type
        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);


        electric.charge(); //this can be called easily through ref type

        ((Tesla) electric).selfDrive();    //must be downCasting

        ((AutoPilot) electric).selfDrive();     //must be downCasting

        /*
        Reference type decides what can be accessed/called
        If we need to access the features that are in object type, but not in the reference type,
        then we need down casting
         */

        System.out.println("-------------------------------------------------------------");

        Employee employee1 = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);


        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();

        //object Type decides what implementation will be executed
    }
}
