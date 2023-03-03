package day09_SwitchContinueAndScanner;

import java.util.Scanner;
// import java.util.*;  //(wild import)

public class ScannerIntro1_Keyboard {
    public static void main(String[] args) {

        //nextByte, nextShort, NextInt, NextLong

        Scanner input = new Scanner (System.in);  //for reading user inputs(keyboard entry)
                                                  // This is the scanner declaration that we created an object of scanner
                                                  // after doing this you can call your variable as many as you want




        System.out.println("Enter your First number:");  // This will wait until you provide a number.
                                                         // if you provide a number bigger than 127 or a string text etc.
                                                         // you will get Input Mismatch Exception
        byte num1 = input.nextByte();

        System.out.println("Enter your Second number:");

        short num2 = input.nextShort();

        System.out.println("Enter your third number:");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number:");


        long num4 = input.nextLong();

        input.close();   // closing

        System.out.println("Enter your fifth number:");

        int num5 = input.nextInt();  // scanner is closed at line 34 , once it's closed can not read inputs.




        System.out.println("First number:" + num1);
        System.out.println("Second number:" + num2);
        System.out.println("Third number:" + num3);
        System.out.println("Fourth number:" + num4);
        System.out.println("Fifth number:" + num5);







    }
}
