package day06_ifStatements;

public class EvenlyDivisible_warmupTask {
    public static void main(String[] args) {

        int number = 65;
        boolean isDivisibleBy2 = number % 2 ==0;
        boolean isDivisibleBy3 = number % 3 ==0;
        boolean isDivisibleBy5 = number % 5 ==0;

        System.out.println(number + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3:" + isDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);

    }
}
/*
3. Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
            Evenly Divisible ==> remainder is zero
 */