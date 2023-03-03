package day38_exceptions.shapeTask;

            //custom exception class
public class InvalidShapeException extends RuntimeException {

    public InvalidShapeException(String message){
        super(message);  //super keyword because this class extends RuntimeExc parent class already
    }

}
