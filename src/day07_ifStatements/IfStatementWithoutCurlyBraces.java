package day07_ifStatements;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int age = 32;

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("No Eligible");
        }

        // so if each condition has only one statement then we do not need to put the curly braces.
        //ex

        if (age >= 21) System.out.println("Eligible");      // curly braces
        else System.out.println("No Eligible");


        System.out.println("=====================================================================");

        // but if we have more than one statement for each if condition then we have to use the curly braces.
        //ex

        int itemNum = 1;

        if (itemNum == 1) {
            System.out.println("Eggs");
            System.out.println("Oranges");
        } else if (itemNum == 2) {
            System.out.println("Milk");
            System.out.println("Onion");
        } else
            // System.out.println("Apple");  //if its only one print statement thats okay to leave the curly braces
            System.out.println("Cherry");


        System.out.println("===========================================================================");

        //ex: weekdays

        int day = 2;

        if (day == 1) System.out.println("Monday");        //false
        else if (day == 2) System.out.println("Tuesday");  // true, so this is the code fragment for this input
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else System.out.println("Sunday");

// IF STATEMENT WITHOUT CURLY BRACES IS NOT A GOOD PRACTICE, YES IT IS DOABLE BUT NOT RECOMMENDED....
// IT LOOKS SHORTER BUT IT CAN NOT BE A REASON TO USE THIS
        // IF YOU WANT SHORTED CODES YOU WILL USE TERNARIES , WE WILL LEARN SOON


    }
}