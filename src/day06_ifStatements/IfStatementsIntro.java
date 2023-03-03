package day06_ifStatements;

public class IfStatementsIntro {
    public static void main(String[] args) {


        int number = - 100;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        //if statement:

        if (isPositive){
            System.out.println(number + " is positive");
        }

        // because number is not positive, nothing will be executed on the console

        if (isNegative){
            System.out.println(number + " is negative");
        }

        if (isZero){
            System.out.println(number + " is zero ");
        }
        // output: -100 is negative

        System.out.println("-------------------------------------------------------------------------");

        //ex
        int num = 0;
        if (num > 0) {
            System.out.println(num + " is positive number");
        }
        if (num < 0) {
            System.out.println(num + " is negative number");
        }
        if (num == 0) {
            System.out.println(num + " is Zero");
        }
                // output: 0 is zero



    }
}
