package day33_abstraction.shapeTask_homework;

public class Square extends Shape{

    private double side;


    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }


    @Override
    public double perimeter() {
        return 4 * side;
    }


    @Override
    public void draw() {

        System.out.println("*  *  * * *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*  *  * * *");
    }



    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                ", side=" + side + '\'' +
                ", area=" + area() + '\'' +
                ", perimeter=" + perimeter() + "}";

    }




}
