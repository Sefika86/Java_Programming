package day13_ReturnMethods;

import java.util.Scanner;

public class ReturnStatementPractice4 {
    public static void main(String[] args) {

        //another approach for nested if we can use return;

        int number = new Scanner (System.in).nextInt();

        if (number < 1 || number > 7){
            System.err.println("Invalid number: " + number);
            return;
        } //after this line 12 we do not need to worry about invalid number, method will already terminate if it is invalid


        System.out.println(     (number==1)?"Monday" :(number==2)?"Tuesday"  :(number==3)?"Wednesday" :(number==4)? "Thursday"
                :(number==5)? "Friday" :(number==6)? "Saturday": "Sunday");

// so if line 12 is executed then line 17 never executed.




    }
}
