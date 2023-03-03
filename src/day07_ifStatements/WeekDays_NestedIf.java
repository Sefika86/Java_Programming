package day07_ifStatements;

public class WeekDays_NestedIf {
    public static void main(String[] args) {



   //this ex was the weekdays task with several single statements and with a print statement at the end for invalid numbers. but it's not
   //the best practice because java will evaluate each and every if statement until the end & until it finds that it's an invalid number

        /*
        int number = 1;
        String day = " ";

        if ( number == 1){
            day = " Monday ";
        }
        if ( number == 2){
            day = " Tuesday ";
        }
        if ( number == 3){
            day = " Wednesday ";
        }
        if ( number == 4){
            day = " Thursday ";
        }
        if ( number == 5){
            day = " Friday ";
        }
        if ( number == 6){
            day = " Saturday ";
        }
        if ( number == 7){
            day = " Sunday ";
        }
        System.out.println(day);
       */


// this is the best way to do it with nested if and multi_branch if.....ex:

        int number = 13;
        String day = "";

    if (number >= 1 && number <=7 ) {   // because it can be 1~7, we are creating a nested if here

        if (number == 1) {
            day = "Monday";
        }else if (number == 2) {
            day = "Tuesday";
        }else if (number == 3) {
            day = "Wednesday";
        }else if (number == 4) {
            day = "Thursday";
        }else if (number == 5) {
            day = "Friday";
        }else if (number == 6) {
            day = "Saturday";
        }else{                //we do not write this last condition for being able to close the valid conditions with an else block
            day = "Sunday";
        }


        }else{
        System.out.println("invalid number");   // this is the end block pre condition if block
        }



    }
}
