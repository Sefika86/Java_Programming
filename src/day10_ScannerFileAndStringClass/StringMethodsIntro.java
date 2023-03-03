package day10_ScannerFileAndStringClass;
import java.util.Scanner;
public class StringMethodsIntro {
    public static void main(String[] args) {

        //charAt() method

        String str = "Cydeo";
                    //01234    index numbers=4
        char firstChar = str.charAt(0); // we call any character with charAt() method
        System.out.println("firstChar = " + firstChar);

        char secondChar = str.charAt(1);
        System.out.println("secondChar = " + secondChar);

        char thirdChar = str.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        char fourthChar = str.charAt(3);
        System.out.println("fourthChar = " + fourthChar);

        char fifthChar = str.charAt(4);
        System.out.println("fifthChar = " + fifthChar);

    // index number can never be less than zero

        System.out.println("==========================================================");

  // length() method

        String sentence = "Java Programming Language";

        int length = sentence.length();

        System.out.println(length);

        int lastIndex = length - 1;

        System.out.println(lastIndex);


        System.out.println("--------------------------------------------------");

        String s1 = "Java is the best programming language";

        char f = s1.charAt(0);

        int lastIndexNum = s1.length() -1;

        char l = s1.charAt(lastIndexNum);

        System.out.println(f +" : "+l);

        System.out.println("--------------------------------------------------");
    // equal() method

        String name1 = "Umran";
        String name2 = new String("Umran");

        System.out.println(name1 == name2);
        System.out.println( name1.equals(name2) );

        System.out.println("---------------------------------------------------");

        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");


        System.out.println(r1 == r2); // true
        System.out.println(r1 == r3); // false
        System.out.println(r2 == r3);  // false

        System.out.println( r1.equals(r3) ); //true
        System.out.println( r2.equals(r3) ); // true

        System.out.println("------------------------------------------------------");
        // equal() method with Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if(age >= 21 &&  answer.equals("yes") ){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }



        input.close();





    }
}
