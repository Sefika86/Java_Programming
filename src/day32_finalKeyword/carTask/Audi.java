package day32_finalKeyword.carTask;

public class Audi extends Car {

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    // we have to override the start method from Car class because it has a diff implementation
    // first we need to check if it is overriden==> it is not private, static, or final so YES
    // right click-> generate -> method override -> start() method -> ok
    //by default it will give super.start(); by we dont want it we will change it with our own sout (new implementation)


    @Override
    public void start() {
        System.out.println("Press the start button" + getMake() + getModel());
    }
}
/*
3. Audi
           start(): "Press the start button"
 */