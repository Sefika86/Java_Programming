package day12_CustomMethodsIntro;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName =input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();


        /* some extra string methods to get rid of white spaces and other unnecessary spaces in the names
        String firstName = input.nextLine().trim().replace(" ", "");  //this trim will remove all white spaces
        // and replace()method will change all " " spaces to "".
        // use replace method if it is necessary , noy only for spaces but also for all characters replacing
        System.out.println("Enter your last name");
        String lastName = input.nextLine().trim().replace(" ", ""); // and because we use spaces that's why we have to use nextLine instead of next
         */

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);
        input.close();

    }
}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format
(first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */