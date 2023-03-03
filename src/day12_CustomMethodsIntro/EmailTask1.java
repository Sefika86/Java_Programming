package day12_CustomMethodsIntro;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email= input.nextLine();


        String firstNAme =email.substring(0, email.indexOf("_"));
        String lastNAme = email.substring(email.indexOf("_")+1, email.indexOf("@"));

        System.out.println(firstNAme);
        System.out.println(lastNAme);
        input.close();
    }
}
/*
Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and followed by an underscore and last name.
Write a program that can swap first name with last name in the email (Separated by an underscore).
If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com


 */