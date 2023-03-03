package day09_SwitchContinueAndScanner;

import day08_Ternary_Switch.SwitchIntro1;

public class NumberOfDays_warmup2 {
    public static void main(String[] args) {

        //2nd warm up task in day 9 recorded video


        int month = 15;

        String result = "";  //bu sefer bunu tercih ettik, at the end we will use default then

        switch (month){

            case 2:
                result = "28 days";
                break;

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                result = "31 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";    //case ler yan yana alt alta farketmez yeterki ayni value sahip olsunlar
                break;                  // use whichever is more readable to you

            default:
                result = "Invalid number";
        }

        System.out.println(result);










    }
}
/*
Create a class named NumberOfDays. An integer variable named month is given
Use switch statement to write a program that can find the number of days in the given number
of month.
                EX:
                    month = 5

                output:
                    31 days

                (Assume that February has 28 days)

            Hints:
            	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11

 */