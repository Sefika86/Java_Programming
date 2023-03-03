package day27_AccessModifiers;


public class TestCircleObjects {

    public static void main(String[] args) {


        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println("===========================================================");

/*
        System.out.println(circle1.pi);  //yellow warning
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);   //even these are doable do not call a static variable with an object

 */

        System.out.println(Circle.pi);


        System.out.println("===========================================================");


       // System.out.println(Circle.radius);     ==> compile error because instances belongs to objects, they can not
       //                                            be called by a class name.










    }
}

/*
calcArea():   ==>inst. met.
calcPerimeter():   ==>inst . met
printPi():     ====static met.
toString():    ===> inst. met
 */