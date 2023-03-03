package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000, 2000};
        int[] arr5 = {110, 210, 310};

        System.out.println("------------------------------------------------------------------------------");
//index of elements        0   1   2    0   1   2   3   4      0    1
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80,}, {90, 100}, arr4, arr5 };
//index of one-dim arrays     0                   1               2        3     4
        System.out.println(arr2D.length);  //total number of one-dimensional arrays

        System.out.println("------------------------------------------------------------------------------");
        System.out.println(Arrays.toString( arr2D[0]) );
        System.out.println(Arrays.toString( arr2D[1]) );
        System.out.println(Arrays.toString( arr2D[2]) );
        System.out.println(Arrays.toString( arr2D[3]) );
        System.out.println(Arrays.toString( arr2D[4]) );

        System.out.println("------------------------------------------------------------------------------");
// how to get the elements: for ex get the element 90:

        System.out.println(arr2D[2][0]); // we do not need Arrays.toString here because it's not array anymore

        System.out.println(arr2D[1][2]); //60

    }
}
