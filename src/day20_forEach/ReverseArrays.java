package day20_forEach;
import utilities.ArraysUtility;
import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {


        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        int[] reverse = new int[array.length];

         //int j = 0; (ister burda initialize et ister loop un icinde)
        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }


        System.out.println(Arrays.toString(reverse));

        System.out.println("---------------------------------------------------------");
// we created reverse method in ArraysUtility

        int[] nums = {100, 200, 300, 400, 500};
        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));


        System.out.println("------------------------------------------");

        double[] a1 = {1.5, 2.5, 3.5, 4.5};

        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));





    }
}
/*
WarmUp3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */