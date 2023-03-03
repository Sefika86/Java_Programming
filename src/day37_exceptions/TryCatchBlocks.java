package day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program started");  //this line will be executed

        try {

            System.out.println(9 / 0);  // (Arithmetic exception) unknown exception
            System.out.println("Try Block");  //this will be skipped

        } catch (ArithmeticException e) {

            System.out.println("Catch Block");
        }
        System.out.println("program ended");  //this line will not be executed if, the exception is not handled

        //Only one of these blocks will handle the exception.
        //here catch block was able to handle

        System.out.println("------------------------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        //   System.out.println(str.toLowerCase());  ==>unchecked exception (NullPointerException)

        try {

            System.out.println(str.toLowerCase());
            System.out.println("Try Block 2");

        } catch (NullPointerException e) {  //or just put RunTimeException which is dedicated to all unknown exceptions

            System.out.println("Catch Block 2");
        }

        System.out.println("Program2 ended");

        System.out.println("------------------------------------------------------------------");

     //checked exception handling ex:

        System.out.println("Program3 started");

        try{

            Thread.sleep(3000);
            System.out.println("Try 3 Block");

        }catch(InterruptedException e){

            System.out.println("Catch 3 Block");
        }

        System.out.println("Program2 ended");



//in this example try block was able to handle the exception. You do not need to memorize which one handled by try,
// which one handled by catch... Just need to now which exception class must be written in the bracket
        //must be is a relationship





    }
}
