package day37_exceptions;

import java.util.ArrayList;

public class ErrorExample {
    //*** DO NOT TRY TO RUN THIS CLASS, IT MAY CRASH YOUR INTELLIJ

    public static void main(String[] args) {
        //For Ex: OutOfMemory Error: means memory is full

        ArrayList<Pizza> pizzas = new ArrayList<>();
        while(true){
            pizzas.add (  new Pizza('S', 2,3)  );
        }
    }

    //when we run this code it will give us OutOfMemory Error, because heap memory is not UNLIMITED

}
