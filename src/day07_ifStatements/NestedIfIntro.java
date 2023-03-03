package day07_ifStatements;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = -300;

        if (score >= 0 && score <= 100) {


            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }


        }else{
            System.out.println("Invalid Score");
        }


        System.out.println("===========================================================");

        // another example

         int age = -200;     //this input does not make sense so it is a bug. For this kind of things,
                            // we need to give the valid possible inputs with nested if method.

        if (age >=1 && age <= 120) {


            if (age >= 21) {   //1~120 is the possible input
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }


        }else {
            System.out.println("Invalid age");
        }



    }
}
