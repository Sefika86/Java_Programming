package day16_NestedLoop;

import java.util.Scanner;

public class OddOrEven_nestedLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) { //outer loop


            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next();

            while (! (answer.equals("yes") || answer.equals("no")) ){  //inner loop
                System.err.println("Invalid answer, please re-enter your answer");
                answer = input.next().toLowerCase();
            } //inner loop closing

            if (answer.equals("no")){
                break;
            }


        } //outer loop closing

        input.close();


    }
}
