package day38_exceptions.shapeTask;

public class Circle extends Shape {

    private double Radius;
    public final double pi = 3.14;




    public Circle(double Radius) {

        setRadius(Radius);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        if(Radius <= 0){
            throw new InvalidShapeException("Radius of a circle can not be negative or zero");
        }
        this.Radius = Radius;
    }


    public double getPi() {
        return pi;
    }


    @Override
    public double area() {
        return pi * Radius * Radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * Radius;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
