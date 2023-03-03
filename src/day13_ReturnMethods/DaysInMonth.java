package day13_ReturnMethods;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        System.out.println("Enter a number of month");
        int month = new Scanner(System.in).nextInt();

        //input.close;  we do not need this because object is only one time use

        //I will use the scanner object only once, so I did not need to assign my it into a Scanner variable

        if (month < 1 || month > 12) {
            System.err.println("invalid number of month");
            return; //terminates the main method
        }

       switch (month){
           case 2:
               System.out.println("28 days");
               break;

           case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               System.out.println("31 days");
               break;

           default:
               System.out.println("30 days");

       }






    }

}
