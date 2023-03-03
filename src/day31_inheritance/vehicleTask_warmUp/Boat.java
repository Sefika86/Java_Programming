package day31_inheritance.vehicleTask_warmUp;

public class Boat extends Vehicle{

    public Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void sail(){ //denize acilmak
        System.out.println(getBrand()+" "+getModel()+" is sailing");
    }
}
