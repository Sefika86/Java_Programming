package day15_BranchingStatements_WhileLoopIntro;

public class Task3_RemoveDuplicates {
    public static void main(String[] args) {


        String str = "xxxyyyzz";

        String result = "";    // to store the final result "xyz"


        for (int i = 0; i < str.length(); i++) {   //i: index numbers of str
            char each = str.charAt(i);       //each char of the string str


            if (!result.contains("" + each)){  //if string result does not contain the character of string str yet
                result += each;   // then we will add the character to sting result
            }

        }

        System.out.println("result = " + result);







    }
}
/*
Write a program that can remove the duplicated characters from a given string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */