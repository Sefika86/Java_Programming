package day19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumNumber_withArray {
    public static void main(String[] args) {

        //Task1: Write a program that can find the maximum number from an array
        //there is a sort method in java to find the max/min number very easy, but usually in the interviews sort method is not allowed


        int[] numbers = new int[]{100, 20, 500, 40, -10, 30};

        int max = numbers[0]; //assume that first element is the maximum number

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {   //compares each element of the array with assumed max number
                max = numbers[i];  //now replace the max number with real max
            }
        }

        System.out.println("max = " + max);

        System.out.println("--------------------------------------------------------");

/*scanner ile denedim olmadi
        int[] nums = new int[5];
        Scanner input = new Scanner(System.in);

        int maxi = nums[0];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            for (int j = 1; j < numbers.length; i++) {
                if (nums[i] > maxi) {
                    maxi = nums[i];
                }
            }
        }

        System.out.println(maxi);

 */





   }
 }
