package day15_BranchingStatements_WhileLoopIntro;

import java.util.Scanner;

public class Task1_MaximumNumber {
    public static void main(String[] args) {
//interview question:
        //write a program that can ask the user to enter a number for five times and returns the maximum number
        Scanner input = new Scanner(System.in);

        int max = -2147483648; //Any integer number that user enter will ALWAYS be greater than -2147483648


        for (int i = 0; i < 5; i++) {  //i = 0,1,2,3,4
            System.out.println("Enter a number");
            int num = input.nextInt();  //suppose that the numbers: -25, 35, 3, 20, 15

            if (num > max) {  // if the user entered entry is greater than the current maximum number that we have
                max = num;    // then user entered number should be the maximum number

            }

        }

        System.out.println("max = " + max); // this statement should be outside the loop

        input.close();


    }
}

