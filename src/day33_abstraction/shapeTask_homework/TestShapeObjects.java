package day33_abstraction.shapeTask_homework;

public class TestShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle("circle", 5);
        System.out.println(circle);
        circle.draw();

        System.out.println("------------------------------------------------------------------------");

        Rectangle rectangle = new Rectangle("rectangle", 5,3);
        System.out.println(rectangle);
        rectangle.draw();

        System.out.println("------------------------------------------------------------------------");


        Square square = new Square("square", 4);
        System.out.println(square);
        square.draw();



    }
}
