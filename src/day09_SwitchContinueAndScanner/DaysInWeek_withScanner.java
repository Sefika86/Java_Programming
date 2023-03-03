package day09_SwitchContinueAndScanner;

import java.util.Scanner;

public class DaysInWeek_withScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //OR  int num = new Scanner(System.in).nextInt();
        // we use this only if we will not use the data more than one
        // we do not need to worry about closing bc it already does this

        System.out.println("Enter the day number:");
        int num =input.nextInt();

        String day = "Invalid";

        if (num>1 && num <=7){

            day= (num==1)? "Monday" :(num==2)? "Tuesday" :(num==3)? "Wednesday" :(num==4)? "Thursday" :(num==5)? "Friday"
                 :(num==6)? "Saturday" :"Sunday";

        } // dont need an else block for nested if

        System.out.println(day);


    }
}
