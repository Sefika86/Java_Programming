package day14_Overloading_ForLoop;

public class WarmUp1_Return {
    public static void main(String[] args) {

        System.out.println(combine("one", "eight"));


    }

    public static String combine(String word1, String word2) {

            String result;

            /*
        if( str1.endsWith(  ""+str2.charAt(0) )   ){  // if the first string ends with the first character of the second string
            result = str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }
         */

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) { //burda == kullandik cunku .equals()  whole string'i compare yapar
            result = word1 + word2.substring(1);
        }else {
            result = word1 + word2;
        }
            return result ;
    }


}
/*
Task1:
Create a method named combine that can take two string and then add them together and returns it.
But if the last letter of the first word and the first letter of the last letter are the same,
return that character once.

	        combine("one", "eight")  ==> oneight
 */