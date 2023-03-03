package day16_NestedLoop;

import java.util.Scanner;

public class LogIn_doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String u, p;

        int attempt = 3;


        do{

            System.out.println("Enter your user name:");
            u = input.next();

            System.out.println("Enter your password:");
            p = input.next();

            attempt--;

            if (attempt == 0){
                break;
            }

        }while (! (u.equals("Cydeo") && p.equals("WoodenSpoon")) ); // while these conditions are incorrect





    }
}
