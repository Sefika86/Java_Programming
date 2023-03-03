package day09_SwitchContinueAndScanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in); //ENTER in Scanner's memory


    System.out.println("Enter your age:");
    int age = input.nextInt();  //when you enter a number and click enter, ENTER will go to memory


    input.nextLine();  //for deleting ENTER from memory

    System.out.println("Enter your full name:");
    String fullName =input.nextLine();

    input.close();






    }
}
