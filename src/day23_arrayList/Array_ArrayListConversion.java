package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_ArrayListConversion {
    public static void main(String[] args) {

//this is how we convert a non-primitive array to an arrayList
        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);

        System.out.println("----------------------------------------------------------------------");

//this is how to convert an ArrayList to an array

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "c#"));
        String[] languages = list2.toArray(new String[0]);  //always give 0 otherwise it will give you null for excessive numbers
        System.out.println(Arrays.toString(languages));


        System.out.println("-----------------------------------------------------------------------------");


        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        Integer[] n = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));






    }
}
