package day06_ifStatements;

public class IdentifyNumber_warmupTask {
    public static void main(String[] args) {

        int number = 200; //bc its a known number we will use boolean.
        boolean isPositive = number >= 0;
        boolean isNegative = !isPositive;
       // boolean isZero = number == 0; bu da olur ama veya daha yaratici bir kod ne olabilir........
        boolean isZero = !isPositive && !isNegative;

        System.out.println(number + " is positive number: " +isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);
    }
}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.
			Ex:
				number = 200
			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */