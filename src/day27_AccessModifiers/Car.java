package day27_AccessModifiers;

import org.w3c.dom.ls.LSOutput;

public class Car {   //outer class

    public String make , model, color;
    public int year;
    public double price;

    public static int wheels =4;


    public class CarEngine{   //inner class
        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }
    }


    public static class StaticInnerClass{  //inner static class

        public void method(){
          //System.out.println(make);  ==>static only accepts static members
            System.out.println(wheels);
        }



    }




}
