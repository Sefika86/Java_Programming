package day12_CustomMethodsIntro;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split? (Yes or No");
        String yesNo = input.next().toLowerCase();  //we use toLowerCase to ignore the case sensitivity

        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();

        System.out.println(" Enter the check amount");
        double amount = input.nextDouble();

        System.out.println("How was the service quality?  Excellent/Great/Good/Fair/Poor");
        String service= input.nextLine().toLowerCase();  //to get rid of case sensitivity

//At this point how we want to calculate the total tip, if or ternary or switch statement methods???
//Let's do the totalTips with ternary


        double totalTip = (service.equals("excellent"))? amount * 0.25
                :(service.equals("great"))? amount * 0.2
                :(service.equals("good"))? amount * 0.15
                :(service.equals("fair"))? amount * 0.1
                : amount * 0.05;

        double totalToPay = amount + totalTip;

        System.out.println("numberOfPeople = " + numberOfPeople);
        System.out.println("totalToPay = " + totalToPay);
        System.out.println("totalTip = " + totalTip);

 //Let's do the yesNo Split?  with Single if statement:

        if (yesNo.equals("yes")){
            System.out.println("Total per person:" + (totalToPay / numberOfPeople));
            System.out.println("Tip per person:" + (totalTip / numberOfPeople) );
        }

// we do not need else block here, if the answer is "NO" then this total per person and
// tip per person will not be executed on the console.







    }
}
/*
\Create a class called TipCalculator, and write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill
or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75



 */