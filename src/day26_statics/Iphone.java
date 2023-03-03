package day26_statics;

public class Iphone {

    //instance vs static variables:

    public static String brand = "Apple";  //static variable can be initialized in the class
    public String model;    //instance variable is initialized in the object
    public String color;
    public double price;
    public static String OS = "IOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

    //instance vs static methods:

    public void printPhoneInfo(){  //if we use an inst.var we have to create an inst. method and inst. methods can be called by an object
        System.out.println("Brand:" + brand);
        System.out.println("Model:" +model);
        System.out.println("Color:" + color);
        System.out.println("Price:" + price);
    }

    public static void printOperatingSystem(){   //static methods can use only static variables and they can be called by class name
        System.out.println("Operating System: " + OS);
    }


    public String toString() {     //toString method is an instance method,
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


    public Iphone(String model, String color, double price) {    //cons. method is an inst. met. It is used to initialize the inst. variables by the objects
        this.model = model;                                      //later on we will learn static blocks that used for initializing the static variables
        this.color = color;
        this.price = price;
    }
}

/*
Attributes:
1.brand = IPhone for all IPhone = static
2.model = instance
3.color = instance
4.price = instance
5.OS = IOS for all iphone = static
6.madeIn = china = static
7.hasBattery = static boolean
8.isTouchScreen =static boolean
9.isExpensiveToFix = static boolean


 */