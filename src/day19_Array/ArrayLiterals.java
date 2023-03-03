package day19_Array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {

        int[] numbers = new int[5]; // instantiating the object if you do not know what the elements are

        int[] nums = {10, 20, 30, 40, 50}; // Array Literal, if you know the elements at the beginning


        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers) );
        System.out.println("nums = " + Arrays.toString(nums) );


        System.out.println("----------------------------------------------------------");

        //element:         1            2          3            4         5          6          7
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index:           0           1           2            3          4          5          6

        int n = 1;
        System.out.println(days[n-1]);  //monday
        System.out.println( days[0]);  //monday
        System.out.println( days[1]);  //tuesday

        System.out.println("----------------------------------------------------------");

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May","Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        /*
        month = new String[12];
        month[0] = "Jan"
        ...
         */

        System.out.println("month = " + Arrays.toString(month) );


        System.out.println("----------------------------------------------------------");

        // months in descending order (reverse):

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.print(month[i] + " ");
        }



    }
}
