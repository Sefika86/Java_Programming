package day14_Overloading_ForLoop;

public class WarmUp2_return {
    public static void main(String[] args) {

        System.out.println(sumOf2IntegerNumbers(10, 20)   );

        System.out.println(sumOf3IntegerNumbers(10, 20, 30) );

        System.out.println(sumOf4IntegerNumbers(10, 20, 30, 40) );


    }
//here we have 3 different methods with three different names. this is not a good practice. Its good to overload these
// 3 different methods under the same name

    public static int sumOf2IntegerNumbers(int n1, int n2) {
        return n1 + n2;
    }

    public static int sumOf3IntegerNumbers(int n1, int n2, int n3) {
        //   return  n1 + n2 + n3;
        return sumOf2IntegerNumbers(n1, n2) + n3;
    }


    public static int sumOf4IntegerNumbers(int n1, int n2, int n3, int n4) {
        // return n1 + n2 + n3 + n4;
        //  return sumOf3IntegerNumbers(n1, n2, n3) + n4;
        //  return sumOf2IntegerNumbers(n1, n2) + sumOf2IntegerNumbers(n3, n4);
        //  return  sumOf2IntegerNumbers(   sumOf3IntegerNumbers(n1, n2, n3)  ,   n4 );
        return  sumOf3IntegerNumbers(   sumOf2IntegerNumbers(n1, n2)  ,  n3 ,  n4  );

    }








}
/*
Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */