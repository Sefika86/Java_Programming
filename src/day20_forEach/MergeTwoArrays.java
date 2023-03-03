package day20_forEach;

import java.util.Arrays;

import utilities.ArraysUtility;

public class MergeTwoArrays {
    public static void main(String[] args) {

        //we will use this merge thing a lot so we created a method in utilities --> ArrayUtility

        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure third array has enough capacity for arr1 + arr2

        int k = 0; // total index numbers of arr3 container

        for (int i = 0; i < arr1.length; i++, k++) {  //bu asamada arr3 i run yaparsak {1, 2, 3, 4, 0, 0, 0} olacak
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // now {1, 2, 3, 4, 5, 6, 7}
            arr3[k] = arr2[i];
        }

        System.out.println("arr3: " + Arrays.toString(arr3));


        System.out.println("------------------------------------------------------------------");

        //another example now we so not write all those for loops again just call the method you created in utilities package.
        // go up and import your method: (import utilities.ArraysUtility;)

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};

        int[] a3 = ArraysUtility.merge(a1, a2);

        System.out.println(Arrays.toString(a3));

        //OR

        System.out.println(Arrays.toString(ArraysUtility.merge(a1, a2)));


        System.out.println("------------------------------------------------------------------");

        // remember that you can not use this merge method for double arrays
        //you need to create another method.
        //and you CAN use the same method name (merge),
        //because as far as your parameters are same you can use the same name for your method

        //ex

        double[] b1 = {10.5, 5.5, 3.5, 6.5, 8.5};
        double[] b2 = {20.5, 15.5, 13.5};

        double[] b3 = ArraysUtility.merge(b1, b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("------------------------------------------------------------------");
//another example with char ,so we created another merge method with char parameters

        char[] ch1 = {'A', 'b', 'c', 'D', 'e'};
        char[] ch2 = {'X', 'Y', 'Z'};

        char[] ch3 = ArraysUtility.merge(ch1, ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("---------------------------------------");
// now we went and created another merge method inn ArraysUtility with string parameters

        String[] c1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] c2 = {"C#", "C++", "Swift"};

        String[] c3 = ArraysUtility.merge(c1, c2);

        System.out.println(Arrays.toString(c3));




    }
 }

/*
WarmUp2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6,7}

	        output
	            arr3 = {1,2,3,4,5,6,7}

 */