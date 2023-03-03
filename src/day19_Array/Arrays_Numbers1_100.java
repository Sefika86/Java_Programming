package day19_Array;

import java.util.Arrays;

public class Arrays_Numbers1_100 {
    public static void main(String[] args) {


        int[] arr1 = new int[100];
        /*
        for (int i = 0, j = 1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }
*/

        //OR

        for (int i = 55; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));

//i is index number between 0 to 100, j is the elements that I want to assign to those indexes of the array




    }
}
