package day11_StringMethods;
import java.util.Scanner;

public class DigitLetterSpecialChar_warmUp3 {
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        // we assign scanner object in to string to use only one time, so no need to close the scanner
        // we can do with one time scanner object, or we can do without scanner object just by assigning a string of text
        //For ex: String  str = "JAva ";

        if(str.length() >= 1){ // if the string has at least one character

            char f = str.charAt(0); //the first character of string

            if(f >= '0' && f <= '9'){
                System.out.println("first character is digit");
            }else if( f >= 'A' && f <= 'Z'){
                System.out.println("first character is uppercase letter");
            }else if( f >= 'a' && f <= 'z'){
                System.out.println("first character is lowercase letter");
            }else{
                System.out.println("first character is special character");
            }


        }else{ // if string is empty
            System.out.println("String is empty");
        }




    }
}
