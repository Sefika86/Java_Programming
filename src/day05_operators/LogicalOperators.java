package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // Logical AND Operator (&&)
        double salary = 60000;
        int creditScore = 650;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650;
        System.out.println(eligibleForLoan); // we have 2 true so output will be true



        double salary1 = 25000 ;
        int creditScore1 = 700,
                age = 25;
        boolean eligibleForLoan1 = salary1 >= 30000 && creditScore1 >= 650 && age >= 18;
                                //        false            true                true
        System.out.println(eligibleForLoan1); // we have two true and one  false so output will be false

        //another example
        age = 16;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println(eligibleToVote);  //false

        System.out.println("--------------------------------------");
        //Logical OR Operators (||) the only time we get a false on output is when both exp are false

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no";
                        //      false                   false
        System.out.println(validAnswer); //both exp are false so output is false

        //ex
        int number = 32;
        boolean result = number <= 32 || number >= 30;
                //          true            true
        System.out.println(result);   // true

        //ex
        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
                           //        false         true               false         false
        System.out.println(passedTheExam);  //so output will be false

        // Logical NOT

        System.out.println(!true);  //false

        //ex
        String a = "yes";
        boolean yes = a == "yes";  //true
        boolean no = !yes;          //no

        System.out.println("yes = " + yes);  //output yes = true
        System.out.println("no = " + no);   //output no = false

        //ex
        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);   //passed = true
        System.out.println("failed = " + failed);   //failed = false


        //ex
        System.out.println("-----------------------------------------");

        System.out.println( true == !false && false == !true && true != !true);  // output will be true
                        //        true              true            true

    }
}
