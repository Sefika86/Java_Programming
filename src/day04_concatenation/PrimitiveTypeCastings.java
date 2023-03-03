package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        // 1)----------------------Implicit Castings-----------------

        //ex1
        byte a =15;
        short b = a;
        //short b = (short)a;

        System.out.println(b);  // you will see 15 on the console.
        int c = a; //implicit casting

        //ex2
        long d = 3000L;
        float f = d;

        System.out.println(f);  // you will see 3000.0 on the console


        // 2)---------------------Explicit Casting----------------------
        //ex1
        int x = 100;
        //byte y = x; // it gives me a compiler because int is larger and byte is smaller.
        byte y2 = (byte) x;

        float z = 20.8F;
        short q = (short)z;

        System.out.println("q = " + q);  //you will see q=20 on the console, because q is an integer.
        System.out.println("z = " + z);  //you will see z=20.8 on the console.

        //ex2
        double n1 = 2.5;
        byte n2 = (byte) n1;

        System.out.println("n2 = " + n2);  //n2 = 2 on the console
        System.out.println("n1 = " + n1);  //n1 = 2.5 on the console

        //ex3
        int num = 500;
        byte result = (byte) num;

        System.out.println("result = " + result); // you will see result= a negative number on the console, because byte is unable to have this 500.

        //ex4
        int r = 50000;
        short t = (short) r;
        System.out.println("t = " + t); // will see a negative nb for t on the console, you dont need to know what number but juts know that its a negative nb because short can not include 50000


        //ex5
        double u = 3000.5;
        int p = (int) u; // explicit casting
        System.out.println("p = " + p); // p = 3000 on the console because int should be an integer of course.

        //ex6
        int o = 100;
        double d1 = o; // directly (implicitly) assigned in to int because int is smaller than double

        System.out.println("d1 = " + d1);  // on the console d1=100.0, because double is designed as a decimal.








    }
}
