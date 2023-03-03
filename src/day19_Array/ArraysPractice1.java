package day19_Array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        //this time we will create Arrays-with Non-primitives
        //Create an array to store your 5 classmates names (length of this array is 5)

        String[] myGroups = new String[5];

        myGroups[0] = "Gulcin";
        myGroups[myGroups.length - 1] = "Aseel";  //last index nb == 4
        myGroups[2] = "Sumeye";
        myGroups[3] = "Abidullah";
        myGroups[1] = "Khashayar";

        System.out.println(Arrays.toString(myGroups));

        myGroups[3] = "Kuzzat"; // if you want to change any element do not go back just send the previous one to gar. coll and create a new one
        // myGroups[5] = "Muhtar"; // you will get bound exception

        System.out.println(Arrays.toString(myGroups));

        System.out.println("-------------------------------------------------------------");


        for (int i = myGroups.length-1; i >= 0; i--) {        // for loop to get the names in reverse 4,3,2,1,0
            System.out.println((myGroups[i]));    //we did not use Arrays.toString because we want to print a particular element of the Array.(index i)
//Inside a loop we are printing one value of the Array so only one ==> index of i. To print whole array together we need to use Array.toString
        }

        System.out.println("-------------------------------------------------------------");

        //shortcut for reverse loop ==> myGroup.forr

        for (int i = myGroups.length - 1; i >= 0; i--) {

        }

        //if you want to start from beginning, do not go back, create a new object

        myGroups = new String[10];
        System.out.println(Arrays.toString(myGroups));
    }
}
