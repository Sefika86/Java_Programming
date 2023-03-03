package day27_AccessModifiers.day25_constructors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTask {
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");

        LocalDateTime time = LocalDateTime.of(2020,11, 24, 1, 0);

        System.out.println(time.format(dtf));

    }
}

/*
Use the LocalDate & Time get the date and time in the following format:
Tuesday, 1:00 pm, Nov./24/2020
 */