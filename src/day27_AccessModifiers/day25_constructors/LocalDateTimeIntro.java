package day27_AccessModifiers.day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts); //this is the default format, later on we will learn LocaltimeFormatter

        LocalDateTime ends = LocalDateTime.of(2023,5,18,11,0);
        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());

        System.out.println(starts.getHour());







    }
}
