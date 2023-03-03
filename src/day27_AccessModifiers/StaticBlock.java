package day27_AccessModifiers;

public class StaticBlock {

    public StaticBlock(){   // we need this const. to be able to run those StaticBlock objects below
        System.out.println("Constructor");
    }

    static{   //will get executed only once
        System.out.println("Static Block");
    }

    public static void main(String[] args) {  //before Java8, static block was executing without main method
        System.out.println("Main Method");    //but after we need this main method


        new StaticBlock();  //these objects never executes without a const. method
        new StaticBlock();  //because each object has a separate copy of instance variables
        new StaticBlock();  //we want to store diff. data for the instance variables of each object

    }

}
