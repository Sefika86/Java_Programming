package day31_inheritance.vehicleTask_warmUp;

public class Bike extends Vehicle{

    public Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void ride(){
        System.out.println("Riding "+getBrand()+" "+getModel());
    }


}
/*
3. Create a subclass of Vehicle named Bike
			Extra methods:
				ride()
 */