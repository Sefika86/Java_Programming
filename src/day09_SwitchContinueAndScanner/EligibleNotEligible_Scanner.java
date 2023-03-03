package day09_SwitchContinueAndScanner;

import java.util.Scanner;

public class EligibleNotEligible_Scanner {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("How old are you?");
    int age = input.nextInt();

    String result = " ";


    if(age>0 && age<=100) {


        if (age >= 21) {
            result = "Eligible to buy alcohol";
        } else {
            result = "Not Eligible to buy Alcohol";
        }


    }else{
        result= "Invalid Age";
    }

        System.out.println(result);
        input.close();
    }
}
