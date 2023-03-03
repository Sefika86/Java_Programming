package day19_Array;

public class MinimumNumber_withArray {
    public static void main(String[] args) {


        int[] numbers = new int[]{15, 56, -89, 74, -1};

        int min = numbers[0]; // assume that first element is the minimum number

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min){   // compares the element of the array with current minimum number
                min = numbers[i];   // replace the current minimum number
            }
        }

        System.out.println("min = " + min);


    }
}