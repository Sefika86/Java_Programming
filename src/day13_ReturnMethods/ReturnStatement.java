package day13_ReturnMethods;


public class ReturnStatement {
    public static void main(String[] args) {

            eligible(45);


/*
        boolean exit = true;
        if(exit) {
            return;
        }

            eligible(76);
*/


 }



        public static void eligible ( int age){

            if (age < 0 || age > 150) {
                System.err.println("Invalid age: " + age);
                return;  //exits the method, this is not a nested if, this if statement and the next if statement are not related
                //they are 2 independent if statements
            }
            if (age >= 21) {
                System.out.println("age: " + age + " You are eligible to buy alcohol");
            } else {
                System.out.println("You are not eligible to buy alcohol");
            }







    }













}
