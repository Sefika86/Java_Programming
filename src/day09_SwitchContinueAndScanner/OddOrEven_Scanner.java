package day09_SwitchContinueAndScanner;

import java.util.Scanner;

public class OddOrEven_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        String result = " ";

        if(num % 2 ==0){
            result = "Number is even";
        } else {
            result = "Number is odd";
        }

        System.out.println(result);
        input.close();
    }
}
