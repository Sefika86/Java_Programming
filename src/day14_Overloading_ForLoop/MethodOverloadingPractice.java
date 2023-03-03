package day14_Overloading_ForLoop;

public class MethodOverloadingPractice {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));

        System.out.println(sum(10, 20, 30));

        System.out.println(   sum(10, 20, 30, 40)   );

        System.out.println(    sum(1.5, 2.5)   );

        System.out.println( sum(2.5, 3.5,  4.5) );

        System.out.println( sum(1.5, 10.5, 20.5, 30.5 ));

        System.out.println( sum(10, 20.5)  );



    }


    //create a method that can find the sum of two integer numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // create a method that can find the sum of three integer numbers
    public static int sum(int a, int b, int c) {
        return sum(a , b) + c;
    }

    // create a method that can find the sum of four integer numbers

    public static int sum(int a, int b, int c, int d) {
        return sum(a,  b,  c) + d;

    }

    public static double sum(double a, double b) {
        return a + b ;

    }

    public static double sum(double a, double b, double c) {
        return sum(a , b) + c;

    }

    public static double sum(double a, double b, double c, double d) {
        return sum(a , b , c) + d;

    }


}