package day37_exceptions;


import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program Started");

        Car car =null;

        //only one of these catch blocks will be executed,
        //whichever exc. class is able to handle the exception will be executed
        try {
            car.drive();   //NullPointerException
        }catch(ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch(RuntimeException e){    //at the last we put this parent exc. class in case other those above can not handle the exception
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        //but NullPointerException was able to catch the exception so only that one executed
    }
}
