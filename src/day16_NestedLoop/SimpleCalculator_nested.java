package day16_NestedLoop;

import java.util.Scanner;

public class SimpleCalculator_nested {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        char mathOperator = ' ';
        double result = 0;

        while (true) {

            System.out.println("enter first number:");
            num1 = input.nextDouble();

            System.out.println("enter a math operator: (-, +, *, /)");
            mathOperator = input.next().charAt(0);

            while (!(mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/')) {

                System.out.println("Invalid math operator,please re-enter your math operator:");
                mathOperator = input.next().charAt(0);

                }


                System.out.println("Enter your second number");
                num2 = input.nextDouble();


            switch (mathOperator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            System.out.println("result = " + result);


            System.out.println("Would you like to continue:  Yes/No? ");
            String yesNo = input.next().toLowerCase();

            while(! (yesNo.equals("yes")|| yesNo.equals("no")) ){
                System.err.println("Invalid Answer! Would you like to continue?Yes/no");
                yesNo = input.next().toLowerCase();
            }

            if (yesNo.equals("yes")) {
                System.out.println();
            } else {
                break;
            }

        }

        input.close();
    }
}
/*
1. Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)

 */