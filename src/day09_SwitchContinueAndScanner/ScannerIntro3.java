package day09_SwitchContinueAndScanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        // next(); for one word characters or string variables and NextLine(); for a words full line
        //Char variable in Scanner class ==> char variableName = input.next().charAt(0);
        //look at nextLine_vs_Next before this class

        Scanner input = new Scanner(System.in);


        System.out.println("Would you like to continue?");
        String answer = input.next();  //for only one word. Even if you write a sentence it will read only the first word
        System.out.println("You have entered:" + answer);

        input.nextLine();  //for deleting ENTER from the memory

        System.out.println("What is your name?");
        String answer2 = input.nextLine();
        System.out.println("Your answer is:" +answer2);


        System.out.println("Enter a character:");
        //char ch =input.next().charAt(0);  // this is scanner methods. we put a dot (.) after next() to call a char, and we put 0 which is the first character
        //but it caused issue becuase this will execute for entire codes from above the below, so always use next() with string

        String ch = input.next();
        System.out.println("Your character is:" + ch);


                        input.close();


// Lets learn nextLine(); vs next(); in another class

    }
}
