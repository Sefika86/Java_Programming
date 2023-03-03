package day16_NestedLoop;

import java.util.Scanner;

public class WarmUp1_CydeLogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name:");
        String u = input.next().toLowerCase();

        System.out.println("Enter your password:");
        String p = input.next().toLowerCase();

        if (u.equals("cydeo") && p.equals("woodenspoon")) { //if the credentials are correct
            System.out.println("Logged in");
        } else { //if the credentials are incorrect

            for (int i = 0; i < 3; i++) {  //three attempts if else block getting executed

                /*
                if(i !=2){
                System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This is your last chance, Please re-enter your username and password");
                }
                 */

                System.err.println("Incorrect username or password! Please re-enter:");
                System.err.println("Enter your username:");
                u = input.next().toLowerCase();
                System.err.println("Enter your password:");
                p = input.next().toLowerCase();

                if (u.equals("cydeo") && p.equals("woodenspoon")) { // if correct now break the loop
                    System.out.println("You are now logged in");
                    break;
                }

            }

                if (!(u.equals("cydeo") && p.equals("woodenspoon"))) {
                    System.err.println("Your account is locked, please contact to the support team");
                }

            }


                        input.close();
        }



    public static void cydeoLogIn(String username, String password){
        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else {
            System.out.println("Invalid credentials");
        }

    }
// this is the second approach for this task,
// you can call this method everytime in for loop above when the credentials are incorrect


}









/*
Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application,
assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials
                if all three attempts are failed, then print "Your account is lucked."
 */