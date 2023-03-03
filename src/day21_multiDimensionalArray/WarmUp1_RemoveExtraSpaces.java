package day21_multiDimensionalArray;

import java.util.Arrays;

public class WarmUp1_RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";

        //str = str.trim();
       // System.out.println(str);   //this will remove the spaces only at the front and at the end of str.

        //we should create array to be able to use the split method.

        String[] words = str.split(" ");
        //System.out.println(Arrays.toString(words));

        str = "";
        for (String each : words) {
            if (!(each.isEmpty())) {
                str += each + " ";
            }
        }
        str = str.trim(); //to remove the last space et the end
        System.out.println(str);


    }
}
/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java

  *** We have to split it by spaces in order to kep the necessary spaces
 */