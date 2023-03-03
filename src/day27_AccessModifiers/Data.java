package day27_AccessModifiers;

public class Data {

// we will create some instance & static variables  and some instance & static methods
//and then go to utilities package, create a class named Test,
//and import (import day27_AccessModifiers.Data_StaticImports;) to see what happens

    public int a, b, c;


    public static int d, e, f;


    public void method1(){
        System.out.println("Method 1");
    }


    public void method2(){
        System.out.println("Method 2");
    }


    public static void method3(){
        System.out.println("Method 3");
    }


    public static void method4(){
        System.out.println("Method 4");
    }

}
