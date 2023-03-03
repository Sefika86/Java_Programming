package day26_statics;

public class TestCarObjects {

    public static void main(String[] args) {


        Car car1 = new Car("BMW");  // a car object created with the 1st const.

        System.out.println(car1);


        Car car2 = new Car("Audi", "Q4");   // a car object created with the 2nd const.



        Car car3 = new Car("Toyota", "Camry", 2021);   //obj. created with the 3rd const.

        System.out.println(car3);


        Car car4 = new Car("Honda", "Accord", 2020, 30000); // a car object created with the 4th const.

        System.out.println(car4);


        Car car5 = new Car("Lexus", "Rx350", 2019, 40000, "Black"); // a car object created with the 5th const.

        System.out.println(car5);


    }
}
