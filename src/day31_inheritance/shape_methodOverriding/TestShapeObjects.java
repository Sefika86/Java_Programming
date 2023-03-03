package day31_inheritance.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {


        Square square = new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("----------------------------");

        Circle circle = new Circle(3.5);

        System.out.println(circle);

        System.out.println("------------------------------------------------------------");

        Triangle triangle = new Triangle(6, 5, 3, 3);

        System.out.println(triangle);

        triangle.draw();


    }

}
