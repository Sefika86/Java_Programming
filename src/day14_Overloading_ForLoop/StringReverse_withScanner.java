package day14_Overloading_ForLoop;

import java.util.Scanner;

public class StringReverse_withScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //            0123   ==>  "avaJ"  ==> that means I have to go to backward direction
        // than my "i" should start from last index number(3) until the first index (0)
        // and we have decrease one by one
        System.out.println("enter your text");
        String str = input.nextLine();

        String reverse = ""; //create an empty container for storing our result in it,
        // this container will store each character backwardly one by one

        for (int i = str.length() - 1; i >= 0; i--) {  // we created for loop to store our characters backwardly from last index to first index

            reverse += str.charAt(i);  //add each char in empty reverse container (backwardly)

        }

        System.out.println(reverse);
        input.close();


    }
}
/*
if (!reverse.contains("" + i)){
                reverse += i;
                }

 eger loopun icine boyle bir  if condition yapsam sonuc tersten index sayilari olur consolda.
 ya da i yerine str yazsam bu seferde index sayisi kadar str yi tekrar eder.
 */