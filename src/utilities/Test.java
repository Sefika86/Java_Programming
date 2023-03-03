package utilities;



import day27_AccessModifiers.Data;  // we import this on day27 to learn static imports

import day27_AccessModifiers.AccessModifiers;  //we import this on day 27 for access modifiers

public class Test {

    public static void main(String[] args) {

 //WE ARE IN ANOTHER PACKAGE BUT STILL CAN USE DATA CLASS BY IMPORTING IT ABOVE

 //for static we use class name
        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();


// for instances we will need an object:
        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();


        System.out.println("--------------------------------------------------------------");

//checking access modifiers on day 27 lecture:


        System.out.println(AccessModifiers.publicData); // public is always accessible in different packages

        //  System.out.println(AccessModifiers.protectedData); // protected is NOT always accessible in different packages

        //   System.out.println(AccessModifiers.defaultData); // default is not be accessible in different packages

        //    System.out.println(AccessModifiers.privateData); // private is not accessible in different packages


        new AccessModifiers();


        AccessModifiers.publicMethod();
        //    AccessModifiers.protectedMethod();
        //    AccessModifiers.defaultMethod();
        //    AccessModifiers.privateMethod();



    }
}
