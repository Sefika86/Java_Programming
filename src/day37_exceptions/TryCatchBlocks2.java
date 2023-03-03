package day37_exceptions;

public class TryCatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1, 2, 3, 4};

        try {

            System.out.println(arr[1000]);  //unchecked exception

        }catch (RuntimeException e){

           e.printStackTrace();  //display full details of the exception after the execution of program

         // System.out.println( e.getMessage());  //Index 1000 out of bounds for length 4
        }

        System.out.println("Program1 ended");

        System.out.println("--------------------------------------------------------------");

        System.out.println("Program2 started");

        try{

            System.out.println(9/0);

        }catch (RuntimeException e) {

            e.printStackTrace();

           // System.out.println(e.getMessage());  //a small message about the exception  (/ by zero)
        }

        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------------------------");

        //shortcut for checked exceptions
        //click on red compile error to see if it is an exception
        //if yes click on red light to surround with try&catch block

        //ex

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
