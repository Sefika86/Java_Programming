package day27_AccessModifiers.day25_constructors;

public class ConstructorsIntro {

// we created 2 constructors in this class. we cN Hvw more than one cons. by overloading.
// constructors must be same name with class name
    public ConstructorsIntro(){
        System.out.println("Object is created by using no argument constructor");
    }  //1- no argument(default) constructor

    public ConstructorsIntro(int a){
        System.out.println("Object is created by using int argument constructor");
    }   //2-int argu,emt constructor


    public  void add(){

    }

    public static void main(String[] args) {

//in the main method , we can create as many object as we want:
        ConstructorsIntro  obj1 = new ConstructorsIntro(10); //this object created by using no-argument cons.

        ConstructorsIntro  obj2 = new ConstructorsIntro();   //this obj. created by int argument

        //  ConstructorsIntro obj3 = new ConstructorsIntro("Java");  //this obj can not be created bc. we do not have string argument cons in class

    }









}
