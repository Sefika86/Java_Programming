package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumbers {

    public static void main(String[] args) {

       //what was the advantage of Array? ==> being able to add multiple same data types.

        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};

        //update your array with the odd numbers only

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 !=0){   // OR, you can use continue statement for even numbers, choice is yours!
                numbers[i] = numbers[i] * 2;
            }

        }

        System.out.println("numbers: " + Arrays.toString(numbers));
    }
}
/*
WarmUp1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];

	                output:
	                	array =[2,2,6,4,10]
 */