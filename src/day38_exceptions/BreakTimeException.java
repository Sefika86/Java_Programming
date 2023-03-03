package day38_exceptions;

public class BreakTimeException extends RuntimeException{

    //we test these in Test Class in this package

    public BreakTimeException() {   //default constructor
        super("It is break time");
    }


    public BreakTimeException(String message) {    //overloading the constructor with String message parameter
        super(message);
    }
}
