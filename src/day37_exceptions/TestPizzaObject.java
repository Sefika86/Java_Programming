package day37_exceptions;

import day36_polymorphism.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {

//every time when we use new keyword, a new memory open in the java heap,
// so these two pizza objects are not the same even they have same size and same numberOfPepTopping

        Pizza pizza1 = new Pizza('S', 2,3);

        Pizza pizza2 = new Pizza('S', 2,3);


        System.out.println(pizza1 == pizza2);    //false

        //so to compare two objects we have to use equals override method


        System.out.println(pizza1.equals(pizza2));   //true


       // System.out.println(pizza1.equals("Pizza"));  //invalid object--> because this how we set in parent class in equals method
                                                                             //and terminates the program

       // System.out.println(pizza1.equals(100));   //invalid object


        System.out.println("----------------------------------------------------------------");
                    //this is upcasting ,so we don't need to write it its already implicitly written(hidden)
        Object obj1 = (Object) new Pizza('M', 2, 4);  //polymorphism

        System.out.println(  ((Pizza) obj1).getSize());  //downCasting (and pof course there must be an is A Rel. between Object and Pizza)
                                                         //(Object class has Is A Rel. with all classes)

        double total = ((Pizza) obj1).calcCost();

        System.out.println(total);

        //polymorphism(downCasting because size variable and calcCost method are not objects class features
        //but reference type decides which can be called which can not

        System.out.println("----------------------------------------------------------------");


        //CAN PIZZA OBJ. CAST TO THE CIRCLE OBJ.? //of course not, it gives us ClassCastException

        //so when do we get exception? when you try to cast the ref type to something that has not IS A REL.

        double area = ((Circle) obj1).area();   //NO COMPILE ERROR but exception

        System.out.println(area); //ClassCastException  (after this line any code are not bale to execute)

        System.out.println("Test completed");

    }
}
