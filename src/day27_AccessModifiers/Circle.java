package day27_AccessModifiers;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = 3.14;


    //if you know the radius you can calculate the diameter so one argument is enough in hte constructor method.
    // and then add the diameter manually.




    //const. met.
    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }




//calcArea(): returns the area of Circle ==> ASK: Do we need any instance var for creating this method???
    //YES
    //So it will be instance method, NOT static.


    public double calcArea(){
        return radius * radius * 2;
    }




 //calcPerimeter(): returns the perimeter of Circle

    public double calcPerimeter(){
        return pi * radius * 2;
    }





//printPi(): displays PI value ==> we do not need any inst. var so it will be a static method
public static void printPi(){
    System.out.println("'PI' value is:  "+ pi);
}


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +             // we added these three lines manually
                ", area=" + calcArea() +   //
                ", perimeter=" + calcPerimeter() +  //


                '}';
    }
}


/*
Warmup tasks:
    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement


 */