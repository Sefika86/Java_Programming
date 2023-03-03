package day38_exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program1 started");

       // System.out.println(10/0);   ==>unchecked NEVER handled by throw keyword

        Thread.sleep(5000);   //try%catch can handle it permanently , throw keyword can do temporarily


        System.out.println("Program1 ended");

        System.out.println("-----------------------------------------------------------");


        System.out.println("Program2 started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");

        //advantage of the throw keyword:
        // 1- it is fastest and shortest way to handle a checked exception at the compile time
        // 2- we do not need to write the throws exception class seperately for each compile
        // 3- your codes are more clean and readable

        //but it handles the checked exc. temporarily
    }
}
