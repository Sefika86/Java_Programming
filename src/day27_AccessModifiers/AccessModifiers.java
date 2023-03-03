package day27_AccessModifiers;

import org.w3c.dom.ls.LSOutput;

public class AccessModifiers {

//variables
    public static int publicData = 200;                 //public variable visible everywhere

    protected static int protectedData = 300;           //protected variable visible in the same class and same package
                                                          //**and sometimes in other packages (subclass)

    static int defaultData = 400;                      //default variable visible in same class and same package, never accessible outside of package

    private static int privateData = 500;              //private variable visible only in the same class


    //=======================================================================================================
    //methods:

    public AccessModifiers(){  //constructor

    }


    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("protected");
    }

    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }

    public static void main(String[] args) {

        System.out.println(publicData);  // public is accessible within same class
        System.out.println(protectedData); // protected is accessible within same class
        System.out.println(defaultData); // default is accessible within the same class
        System.out.println(privateData); // private is accessible within the same class


        System.out.println("------------------------------------------------------------------");

        //all AM (public,protected,default,private) const. method is accessible in the same class
        new AccessModifiers();

        System.out.println("------------------------------------------------------------");

        //other regular methods: all AM are accessible in the same class
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();

    }


}
