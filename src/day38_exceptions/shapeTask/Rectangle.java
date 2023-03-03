package day38_exceptions.shapeTask;

public class Rectangle extends Shape {

    private double width;
    private double length;


    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            throw new InvalidShapeException("Width of the rectangle can not be negative or zero");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            throw new InvalidShapeException("Length of the rectangle can not be negative or zero");
        }
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * ( width + length );
    }
}
