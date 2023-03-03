package day15_BranchingStatements_WhileLoopIntro;

import java.util.Scanner;

public class Task2_MinimumNumber {
    public static void main(String[] args) {
 // interview Task
        // write a program that can ask the user to enter a number for five times,  print the minimum number


        Scanner input = new Scanner(System.in);

        int min = 2147483647; //Any integer number that user enters will ALWAYS be less than 2147483647

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int num = input.nextInt();   // 20, 30, -5, 100, 200

            if (num < min) { // if the user entered entry is less than the current minimum number that we have
                min = num; // then user entered number should be the minimum number
            }

        }


        System.out.println("Minimum number is: " + min);  // always outside for loop


        input.close();
    }
}
