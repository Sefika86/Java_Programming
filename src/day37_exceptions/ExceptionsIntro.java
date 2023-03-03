package day37_exceptions;
import java.io.FileInputStream;
public class ExceptionsIntro {

    public static void main(String[] args) {

        String str = "Java";

        System.out.println(str);

       // char ch = str.charAt(250); // unchecked exceptions
       // System.out.println(ch);

        Pizza pizza = null;
        //  pizza.calcCost();  // unchecked exception


        // System.out.println( 50/0 ); // un-checked exception

        System.out.println("Hello World"); //any codes below the unchecked exception will not execute

        System.out.println("---------------------------------");
//do not confuse bug and exceptions, in this example below; there is a bug but not an exception
        int score = 100;

        if(score > 59){
            System.out.println("Your grade is D");
        }else if(score > 70){
            System.out.println("Your grade is C");
        }

        System.out.println("---------------------------------");

      //  FileInputStream file = new FileInputStream(""); //Checked Exception

       //  Thread.sleep(3000); // Checked exception (known at compile time)
                                  //we can not even run the codes





    }
}
