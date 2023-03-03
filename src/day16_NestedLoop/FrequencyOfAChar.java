package day16_NestedLoop;

public class FrequencyOfAChar {
    public static void main(String[] args) {

        //this is only for finding one character,
        // if you want to find all characters you have to use nested loop.
        // Look at NestedLoopPractice for finding frequency of all characters in a string

        String str = "aaabbbbccccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {  //i = index numbers of str

            if(str.charAt(i) == ch){  //if the character of the string is equal to given character. it means the given character has appeared
                count++;
            }
        }


        System.out.println(count); // frequency of 'c' is 4


    }
}
/*
2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'
		     output:
		     	5
 */