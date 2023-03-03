package day16_NestedLoop;

import java.util.Scanner;

public class FrequencyOfWord_WhileLoop_vs_ForLoop {
    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        int count = 0;

//with while loop
        while (sentence.contains(word)) {
            count++; //ama eger boyle birakirsak surekli ilk java'yi gorur ve sayip durur
            // o yuzden bir java'yi sayar saymaz yerine baska birsey koymaliyiz ki sayildigini anlasin
            sentence = sentence.replaceFirst(word, "");
        }
                    System.out.println(count);

        System.out.println("----------------------------------------------------------------------------------");
//with For loop

        for (; sentence.contains(word); ) {
            count++;
            sentence = sentence.replaceFirst(word, "");//clean the words that we look for to stop loop
            if (!sentence.contains(word))
                break;
        }
                    System.out.println(count);


        System.out.println("----------------------------------------------------------------------------------");
//with For loop another approach

        System.out.println("enter a sentence");
        String str = new Scanner(System.in).nextLine().toLowerCase(); // java JAVA jAvA JAva
        String word1 = "java";
        String word2 = "";


        for (int i = 0; i < str.length(); i++) {
            if(str.contains(word1)){
                word2 = str.replace(word1,word1.substring(0,word1.length()-1));
            }
        }
        System.out.println(str.length() - word2.length());


    }
}

/*
Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"
		    output:
		        4
        "Java Java Java Java"; //count = 0;
        " Java Java Java" // count = 1
        " Java Java" // count = 2;
        " Java"    // count = 3
        " "       // count = 4
 */