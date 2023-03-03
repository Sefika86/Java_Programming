package day06_ifStatements;

public class OddOrEven_warmupTask {
    public static void main(String[] args) {

        int number = 20;

        boolean isEven = number % 2 == 0; //when we divide a number by 2, if the reminder is 0 , means the nb is even

        boolean isOdd = !isEven; // If the nb is not even
        // be careful which boolean you should use in which print statement, if you ask is number even? then you should use boolean isEven
        System.out.println(number + " is an even number: " + isEven);  //20 is an even number: true
        System.out.println(number + " is an odd number: " + isOdd);     // 20 is an odd number: false

    }

}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20
			output:
				20 is an even number: true
				20 is an odd number: false
        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
        even: 2, 4, 6, 8, 10 ...
        odd: 1, 3, 5, 7, 9 ...

 */