package utilities;

public class Library {


    public static void sleep(double seconds){

        //if we put only ==> Thread.sleep((long) (seconds * 1000L)); in the body of method
        //it will give every time checked exception when we use this method
        //,so we created the method with try&catch method to get rid of exceptions

        try {
            Thread.sleep((long) (seconds * 1000L));
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }



    }
}
