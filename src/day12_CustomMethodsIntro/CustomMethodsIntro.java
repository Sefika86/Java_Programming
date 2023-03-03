package day12_CustomMethodsIntro;

public class CustomMethodsIntro {

    public static void main(String[] args){

        System.out.println("Test Started");   //1

        greetings();   //3

        System.out.println("Test Completed");   //1

        displayMessage();  //2
        // 7 sentences will be executed, it doesn't matter custom method is below or above the main method.
        // Always the execution order will be same as in the main method.
    }

    public static void greetings() {

        System.out.println("Hello everyone");
        System.out.println("How are you all today?");
        System.out.println("Are you ready to learn java");

    }

    public static void displayMessage(){

        System.out.println("Hello World");
        System.out.println("I love Java");

    }


}

// these are the custom methods without the parameters which means nothing in the parenthesis ()