package day32_finalKeyword.carTask;

public class Car {

    private String make, model, color;
    private int year;
    private double price;

    public static int numberOfWheels;
    public static boolean hasBattery;


    // note: make of the car can be set to the class name==> so no need to write "make" in arguments of constructor.
    //we will assign the make name to the class name because of this requirement ==>note: make of the car can be set to the class name


    public Car(String model, String color, int year, double price) {
        setMake(getClass().getSimpleName());
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }// I change this. keyword to set because instead of assigning the given value right away I wasn't my constructor to check if the value is valid or not


    //I do not set the static variables in the constructor because we want to initialize the statics one time but
    // constructor will be executed as many as the number of objects we creat later on. Wew initialize statics in static block which executes only one

    static{
        numberOfWheels = 4;
        hasBattery = true;
    }



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 0){
            System.err.println("Invalid year: "+year);
            System.exit(1);  //terminates the program
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public void start(){
        System.out.println("Press the brake and twist the key to ignition "+make + model);
    }


    @Override   //toString is coming from Object class so we can override it in parent class
    public String toString() {
        return make +"{" +   //we changed "Car" to ==> "make"
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", wheels=" + numberOfWheels +   //if you want you can add static variables too
                ", =" + price +
                '}';
    }
}
/*
1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)
            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero
            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name
            Methods:
                start(): "Press the brake and twist the key to ignition"
                toString()
 */