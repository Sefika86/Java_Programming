package day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 155;
        boolean isEven = number  % 2 ==0;

        if (isEven){
            System.out.println("Even number");
             }
            //nothing will be executed on the console
        if (!isEven) {
            System.out.println("Odd Number");
        }
            // odd number will be executed on console.

        System.out.println("------------------------------------------");

        //without using a boolean variable;

        int value = 33;
        if (value % 2 != 0){
            System.out.println("Odd number");
          }
        // Odd Number will be executed.....if value = 34, then nothing executed on console



    }
}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even, BUT THIS TIME WITH USING IF STATEMENT
			Ex:
				number = 20
			output:
				20 is an even number: true
				20 is an odd number: false
        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
        even: 2, 4, 6, 8, 10 ...
        odd: 1, 3, 5, 7, 9 ...

 */