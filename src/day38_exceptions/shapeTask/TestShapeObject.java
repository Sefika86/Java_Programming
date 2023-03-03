package day38_exceptions.shapeTask;

import org.w3c.dom.css.Rect;

public class TestShapeObject {

    public static void main(String[] args) {

        Circle circle = new Circle(2.5);  //we created our own unchecked custom exception class for invalid shape information

        System.out.println(circle);

        Square square = new Square(4);

        try {
            square.setSide(-9);
        }catch (InvalidShapeException e){    //custom unchecked exception is handled
            e.printStackTrace();
        }

        Rectangle rectangle = new Rectangle(6,2);

        System.out.println(rectangle);


    }
}
