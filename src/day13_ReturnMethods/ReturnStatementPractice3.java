package day13_ReturnMethods;

import java.util.Scanner;

public class ReturnStatementPractice3 {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);  //we will use the object only once

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        //now if the grade is invalid we want to terminate this method: we have to use return statement

        if (!isValid) {
            System.err.println("Invalid Grade");
            return;

            // this means if the grade is invalid this method will be terminated, but if valid then next statement
            //below will be run
        }
        System.out.println((grade == 'A') ? "excellent" : (grade == 'B') ? "Great Job" : (grade == 'C') ? "Good"
                : (grade == 'D') ? "Passed" : "Failed");


    }


}
