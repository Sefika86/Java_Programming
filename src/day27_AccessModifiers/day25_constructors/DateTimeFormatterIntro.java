package day27_AccessModifiers.day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y/MMMM/dd");

        LocalDate today = LocalDate.now();

        System.out.println(today);  //we will get today's date as a default value

        System.out.println(today.format(df));

        System.out.println("---------------------------------------------------------------");

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("MMMM-dd-yy, EEEE");

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("EEEE, MM/dd/y");

        LocalDate date1 = LocalDate.of(2022, 7, 1);

        System.out.println(date1.format(df1));  //July-01-22, Friday

        System.out.println(date1.format(df2));  //Friday, 07/01/2022

        System.out.println("------------------------------------------------------------------");


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17, 5);


        System.out.println(time1.format(tf)); //5:05 p.m. (muhtar has PM , I have p.m. why???)

        System.out.println("------------------------------------------------------------------");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));  //Thursday, Nov./24/2022 01:36 PM
    }
}
