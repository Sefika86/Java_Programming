package day33_abstraction.shapeTask_homework;

import java.text.DecimalFormat;

public class Circle extends Shape {

    private double radius;
    public static double pi;

    DecimalFormat df = new DecimalFormat("0.00");

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }


    static {
        pi = 3.14;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return pi * radius * radius;
    }


    @Override
    public double perimeter() {

        return  2 * pi * radius;
    }


    @Override
    public void draw() {
        System.out.println("draw a circle");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                ", radius=" + radius + '\'' +
                ", area=" + df.format(area())+ '\'' +
                ", perimeter=" + df.format(perimeter()) + "}";

    }
}
