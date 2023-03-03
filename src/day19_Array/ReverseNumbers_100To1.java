package day19_Array;

import java.util.Arrays;

public class ReverseNumbers_100To1 {
    public static void main(String[] args) {

        int[] reverse1 = new int[100];
        int[] reverse2 = new int[100];
        int[] reverse3 = new int[100];
        int[] reverse4 = new int[100];


        for (int i = reverse1.length - 1, j=100; i >= 0; i--, j--) {
            reverse1[i] =100-i;
        }

        // OR

        for (int i = reverse2.length - 1; i >= 0; i--) {
            reverse2[i] = 100-i;
        }

        //OR


        for (int i = 0, j =100; i < reverse3.length; i++, j--) {
            reverse3[i] = j;
        }

        //OR

        for (int i = 0; i < reverse4.length; i++) {
            reverse4[i] = 100 - i;
        }

        System.out.println("reverse1 = " + Arrays.toString(reverse1));

        System.out.println("reverse2 = " + Arrays.toString(reverse2));

        System.out.println("reverse3 = " + Arrays.toString(reverse3));

        System.out.println("reverse4 = " + Arrays.toString(reverse4));




    }
}
