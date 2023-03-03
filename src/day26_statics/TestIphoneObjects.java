package day26_statics;



public class TestIphoneObjects {

    public static void main(String[] args) {


Iphone iPhone = new Iphone("iphone12", "Black", 1000);


        System.out.println(iPhone.model);  // you see? through the object you can call the instance variables
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        //but objects are coming from the class. so if the class has its own members (instance or static variables),
        // then those class members can be shared by all the objects as well


        System.out.println("-----------------------------------------------------------------------------------------");

      //SO even tho. brand is static, it is still can be called through the object
      //but even its doable you shouldn't do it (it gives that yellow triangle warning)

        System.out.println(iPhone.brand);
        System.out.println(iPhone.OS);
        iPhone.printOperatingSystem();


       //call the statics through the class name:
       //ex

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();


    }
}
