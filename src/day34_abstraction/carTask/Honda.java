package day34_abstraction.carTask;

public class Honda extends Car{


    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    @Override
    public void start() {   //if you want this method to be accessed in other pack. classes make it public
        System.out.println("Twist the key to ignition to start  " + getMake() + " " + getModel());
    }
}
