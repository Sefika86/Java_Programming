package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods_Array {
    public static void main(String[] args) {
//toCharArray() method: gives us a char array

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();
//                     to replace that space with empty   to give us all chars in the string
        System.out.println(Arrays.toString(ch));

        System.out.println("------------------------------------------------------------");

//how to split the words one by one from the string
//split method: gives us a string array
        String str2 = "Today is great day to learn java";

        String[] words = str2.split(" ");  //split the string by the spaces to obtain all words one by one
        System.out.println(Arrays.toString(words));

        String[] words1 = str2.split("great"); // split it by the word great to have 2 elements in total
        System.out.println(Arrays.toString(words1));


        System.out.println("------------------------------------------------------------");

        String sentence = "I Love Java";

           //                   this creates a new array with reversed elements
        String [] arr = ArraysUtility.reverse(sentence.split(" "));  //Java, Love, I

        System.out.println(Arrays.toString(arr));

        String reversedSentence = "";

        for (int i = 0; i < arr.length; i++) {

            reversedSentence += arr[i] + " ";
        }
        System.out.println(reversedSentence);
    }
}