package day31_inheritance;

//Field Hiding is only between a parent and a child
//A == parent
//FieldHiding == child

class A {   //if we create two classes in the same class (not nested), the only option one must be default


    public int a = 100;

}


public class FieldHiding extends A {


    public int a = 300;

    public static void main(String[] args) {

        System.out.println(new FieldHiding().a);

        //if output is == 100  , that means parent class is inherited to child class(which is impossible)
        //if output is == 300  , that means child class is inherited to parent class, AND PARENT CLASS VARIABLE IS (IMPLICITLY) HIDDEN



    }


}
