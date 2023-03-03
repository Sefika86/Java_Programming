package day19_Array;


import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        int score1 = 85;    //you can need 5 different containers (variables) to store 5 different data.
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;


        System.out.println("-----------------------------------------");
        //if I know how many elements(scores) I want to score, I can create array as far as they are same data type.

        int[] scores = new int[5];  //index: 0 ~ 4 ( 0 ~ total elements -1)
        // declaring array variable = instantiating array
        //we have to store 5 elements in this array , not more not less

        System.out.println(scores); // you will get a hash-code because you did not have toString method
        // but in order to run this array FIRST you have import java.util package from the utility class of java
        // import java.util.Arrays
        //then you will be able to call toString method to get rid of getting a hash-code
        //Every single method in utility class (presented in java library) is static method
        //which means not instance , so you have to call them through the class name


        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;

        //scores[5] = 100;  // you will get bound exception because we do not have index nb 5 in this array
        //scores[-1] = 65;

        //System.out.println( Arrays.toString(scores) ); //now you will get 5 scores

        //we can not turn back and change the number of elements
        //but, we can instantiate a new scores object and then ( new int [5]; ) ==>this object goes to garbage collector

        //scores = new int[10];  //0 ~ 9  // now this is our new object, and it does not contain those scores (78,85,75,88,95) anymore
        //every single object has its own memory

        //scores = new int[50]; // 0 ~ 49  ,now previous 2 objects are eligible for garbage collector after this line 46

        System.out.println( Arrays.toString(scores) );

        System.out.println(scores[2]);  //this will give us 2nd index score == 78

        //if you want to repeat all scores you will use loop

        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {  // i: index numbers of scores array

            System.out.println(scores[i]);

        }

//BE CAREFUL!! THIS LENGTH IS VARIABLE. IT IS NOT THE LENGTH() METHOD


        System.out.println("---------------------------------------------------------------------------");

        // NOW HOW YOU GET THE LAST INDEX NB OF ELEMENT ONLY

        System.out.println( scores[scores.length-1]);  //last index nb is 4 ===> score is 95


    }

}
