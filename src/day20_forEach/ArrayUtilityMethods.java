package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
//toString()
        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));
        //if this to string method return us a string value then it should be able to assign in a string variable

        String result = Arrays.toString(score);
        System.out.println(result);

        System.out.println("---------------------------------------");

//equals()
        int[] a1 ={1,2,3,4,5};
        int[] a2 ={1,2,3,4,5};

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);    //true

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1, ch2);
        System.out.println(r2);    //false

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1, s2));  //false

        System.out.println("---------------------------------------");


//sort() --> sort in ascending order from smallest to largest

        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum Number: " + nums[0]);
        //but 99% we will not allow to use sort method to find the max/min. They want us to use loop to see our logic
        System.out.println("Maximum Number: " + nums[nums.length-1]);

    //ex
        String[] b1 = {"C", "A", "B"};
        String[] b2 = {"B", "C", "A"};

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1, b2)); //true

        String[] students = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("---------------------------------------");
//copyOf()
        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array, 10);

        System.out.println(Arrays.toString(array2));

        System.out.println("---------------------------------------");


        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length );

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j]= n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("----------------------------------------");

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //  index:    0    1    2    3    4    5    6

        char[] result1 = Arrays.copyOf(ch, 20 );

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2, 5); // excludes ending index( here 'F' excluded)

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);

        System.out.println(Arrays.toString(result3));





    }
}
