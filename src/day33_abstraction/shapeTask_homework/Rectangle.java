package day33_abstraction.shapeTask_homework;

public class Rectangle extends Shape {

    private double height;
    private double length;


    public Rectangle(String name, double height, double length) {
        super(name);
        setHeight(height);
        setLength(length);
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getLength() {
        return length;
    }


    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public double area() {
        return length * height;
    }


    @Override
    public double perimeter() {
        return 2 * (length + height);
    }


    @Override
    public void draw() {

        System.out.println("* * * * * * * * * *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("* * * * * * * * * *");
    }



    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                ", height=" + height + '\'' +
                ", length=" + length + '\'' +
                ", area=" + area() + '\'' +
                ", perimeter=" + perimeter() + "}";

    }






}
