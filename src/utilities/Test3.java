package utilities;

import day31_inheritance.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //before extending :

       // System.out.println(ProtectedAccessModifier.a);
       // ProtectedAccessModifier.methodA();

//instance variables and methods that we created in another package, are not visible in another package's super class
//but if we extend this super class to that class where we created the instances,
// then we can access the protected variables and methods


        //after extending:

        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.methodA();
    }




}
