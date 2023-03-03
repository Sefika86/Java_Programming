package day21_multiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
//                         0    1   2    0   1   2   3   4      0    1
        int[][] arr2D = { {10, 20, 30}, {40, 50, 60, 70, 80,}, {90, 100} };
//                              0                1                 2


    // iteration with nested for loop
        for(int i = 0; i < arr2D.length; i++){  //i: index nb of one-dimensional arrays

            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++) {  //j = index number of elements in each one-dimen array

                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }
        System.out.println("-------------------------------------------------------------------------------------");
    // iteration with nested for each loop

        for (int[] each1DArray : arr2D) {

            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray){

                System.out.println(eachElement);
            }
        }

        System.out.println("-------------------------------------------------------------------------------------");
// reverse with nested for loop

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.println(arr2D[i][j]);

            }
        }

        System.out.println("-------------------------------------------------------------------------------------");
//Elements with nested for each loop

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }

        }






    }
}

