package day32_finalKeyword.carTask;

public class BMW extends Car {


    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    // we have to override the start method from Car class because it has a diff implementation
    @Override
    public void start() {
        System.out.println("Call the mechanic or jump start " + getMake() + getModel());
    }
}

/*
BMW
         start(): "Call the mechanic or jump start"
 */