package day30_inheritance.phoneTask;

public class Iphone extends Phone {  //if you call parent's constructor explicitly , you have compile error


    public static boolean hasApplePay = true;  //static variables should be public and never initialized in the constructor



    //parent constructor must be called in child class with super() keyword
    public Iphone(String model, String size, String color, double price){
        super("Apple", model, size, color, price);
    }

    //brand is same for all iphone ==> apple
    //it is not a good idea to make the model --> static in parent class, because samsung, iphone, nokia all have different brands
    //but we can delete String brand from the parameters and put "Apple" in super() keyword.



    //overloaded methods
    public void faceTime (long phoneNumber){
        System.out.println(getModel() + " is making face time with " + phoneNumber);
    }


    public void faceTime (String email){
        System.out.println(getModel() + " is making face time with " + email);
    }


}
/*
2.1 IPhone:

                    Extra variables:
                         hasApplePay
					Extra methods:
						faceTime(phoneNumber)
						faceTime(email)
 */