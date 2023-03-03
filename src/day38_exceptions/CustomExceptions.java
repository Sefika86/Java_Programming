package day38_exceptions;

class CustomCheckedException extends Exception {

    //checked exception custom class must have is a relationship with Exception Class
}

class CustomUncheckedException extends RuntimeException {

    //Unchecked exception custom class must have is a relationship with RuntimeException Class

}


public class CustomExceptions {

    public static void main(String[] args) {

        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------");

        try {
            throw new CustomUncheckedException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        //both checked and unchecked exceptions are handled
        //Process finished with exit code 0
    }
}
