package day15_BranchingStatements_WhileLoopIntro;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int max = -2147483648;  //in order to find the max number, we assign the smallest number in java
        int min = 2147483647;   //in order to find the min number, we assign the largest number in java


        for (int i = 0; i < 5; i++) {  //i = 0,1,2,3,4
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > max) {  //we didn't use else here because if a number is not max in a few numbers that doe not mean that it's the minimum
                max = num;
            }

            if (num < min){
                min = num;
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        input.close();





    }
}
