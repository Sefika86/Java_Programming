package day15_BranchingStatements_WhileLoopIntro;

import java.util.Scanner;

public class EligibleToVote_WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();  //valid age=1~120

        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid Entry, please enter your age:");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No?");
        String yesNo = input.next().toUpperCase();

        while (!(yesNo.equals("YES") || yesNo.equals("NO"))) {
            System.err.println("Invalid entry! Please re-enter");
            System.err.println("Are you a US citizen? Yes/No?");
            yesNo = input.next().toUpperCase();
        }

            if (age >= 21 && yesNo.equals("YES")) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible to vote");
            }


        input.close();

    }
}
