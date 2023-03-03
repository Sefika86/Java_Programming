package day19_Array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber_withArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter"); // the answer of the user will be my total numbers of elements in the array
        int howManyNumbers = input.nextInt();

        int[] allNumbers = new int[howManyNumbers];  //array object. nb of elements is equal to == howManyNumbers

        int sumOfNumbers = 0;

        for (int i = 0; i < howManyNumbers; i++) {     //howManyNumbers == length of my elements
            System.out.println("Enter a number:");
            allNumbers[i] = input.nextInt();
            sumOfNumbers += allNumbers[i];
        }

        double average = (double)sumOfNumbers / howManyNumbers;  //for getting an exact answer cast one of these integers(sumOfNumbers OR howManyNumbers) to double
        DecimalFormat df = new DecimalFormat("0.00");   //decimal formatting

        System.out.println("allNumbers = " + Arrays.toString(allNumbers));   //this is array you have to call toString
        System.out.println("sumOfNumbers = " + sumOfNumbers);
        System.out.println("average = " + df.format(average));


        input.close();
    }
}
/*
AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
 */
