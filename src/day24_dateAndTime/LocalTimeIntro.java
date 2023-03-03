package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {


        LocalTime starting_time = LocalTime.of(10,30);

        System.out.println(starting_time);   //10:30

        LocalTime right_now = LocalTime.now();

        System.out.println(right_now);

        System.out.println("----------------------------------------------------------");

        LocalTime time1 = LocalTime.of(23,59); //hour should be 0~23, minute and second should be 0~59
        System.out.println(time1);                        //otherwise LocalTime Exception


        time1 = time1.plusHours(1);  // but you can always increase and decrease (change) the time with the methods to create a new object

        System.out.println(time1);

        time1= time1.plusMinutes(45);

        System.out.println(time1);


    }
}
