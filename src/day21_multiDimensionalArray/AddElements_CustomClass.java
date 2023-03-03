package day21_multiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements_CustomClass {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int element = 6;

        //we will need a new array for adding the sixth element

        int[] new_Array = Arrays.copyOf(array, array.length + 1);

        new_Array[new_Array.length - 1] = element;  //is the element that we are trying to add in our array

        System.out.println(Arrays.toString(new_Array));

        // now go to arrays utility and create a custom class for add element method

        System.out.println("------------------------------------------------------");

        int[] numbers = {100, 90, 80, 70, 60};
//how can we add an element into this array?  by using the addElement method we created in ArraysUtility class
//how to call the method? ==> className.methodName(parameters: old array name, new element that we want to add)

        ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------------------------------");
//adding double elements by using double overloaded addElement method


        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArraysUtility.addElement(nums, 5.5);

        nums = ArraysUtility.addElement(nums, 6.5);

        nums = ArraysUtility.addElement(nums, 7.5);

        System.out.println(Arrays.toString(nums));


        System.out.println("------------------------------------------");
/*
        String[] students = {"Yasin", "Sumeye", "Ermek"};

        students = ArraysUtility.addElement(students, "Umran");

        students = ArraysUtility.addElement(students, "Abidullah");

        students = ArraysUtility.addElement(students, "Muhtar");

        System.out.println(Arrays.toString(students));

 */



    }
}
