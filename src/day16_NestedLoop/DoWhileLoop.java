package day16_NestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

// let's look at for loop if condition is false, what happens?

        boolean condition = false;

        for (; condition ;) { //there is no point to give initialization and iterator ,if the cond. is false
            System.out.println("Hello Cydeo");  // bu statement asla execute olmaz
        }


//let's look at while loop:

        while(condition){
            System.out.println("Hello Cydeo ........while loop");  //never executes
        }

//now let's look at DO WHILE LOOP:

        do {
            System.out.println("Hello Cydeo..........do while loop"); //this is executed once before checking the cond.
        }while (condition);

        //if condition is true the statement gets executed repeatedly until the cond. is false
    }
}
