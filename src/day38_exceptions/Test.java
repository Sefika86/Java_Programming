package day38_exceptions;

import utilities.Library;

import java.time.LocalTime;


public class Test {

    public static void main(String[] args) {

        //we created a sleep method in library class (in utilities)

        System.out.println("Hello Cydeo");

       // Thread.sleep(3500); //when we call it with Thread class, it gives compile error (checked exceptions)

        Library.sleep(3.5);  //but we created a method with try&catch in Library class(in utilities pack)
                                    //we do not need to do throw keyword handling each time when we call sleep from Library

        System.out.println("How are you today?");

        System.out.println("--------------------------------------------------------");

        //create a breakTimeException id the time is 4pm?

        if(LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException();   //default constructor in BreakTimeException Class
        }

        throw new BreakTimeException("Time to go home");  //the second constructor we overloaded in BreakTimeException Class

    }
}
