package utilities;

//import day27_AccessModifiers.Data;  TOO EXTRA , NO NEED

import static day27_AccessModifiers.Data.d;

import static day27_AccessModifiers.Data.method3;

import static day27_AccessModifiers.Data.*;   //this import can access to all static members(variables & methods) of Data class

public class Test2 {

    public static void main(String[] args) {

//with this static import ==> import static day27_AccessModifiers.Data.d;
//you can call static variable d without class name

        //System.out.println(Data.d);   NO NEED to use class name or to import all class.It is too extra

        System.out.println(d);

//we imported method3 above:

        method3();


//if we import Data.*; we do not need the other individual import statements. it helps us to access all static members of a class


        System.out.println(e);
        System.out.println(f);
        method4();


       // method2(); ==>can not be called, we definitely need to create a Data class object for this instance method.



    }
}
