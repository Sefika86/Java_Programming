package day34_abstraction.carTask;

public abstract class Car {  //once we put this abstract keyword here it can not be instantiated anymore

    private final String make;    //until initializing (in constructor) it gives compile error
    private final String model;   //because final variables do not have the default value
    private String color;         //so any final variable must be initialized once and last to be used
    private final int year;
    private double price;


    public Car(String model, String color, int year, double price) {

        this.make = getClass().getSimpleName();
        this.model = model;
        setColor(color);

        if(year < 1986){
            System.err.println("Invalid year: "+year);
            System.exit(1);
        }
          this.year = year;

        setPrice(price);
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }



    protected final void stop(){  //the reason we made this protected because I don't want other subclasses outside package to access it
        System.out.println("Press the brake to stop "+ make + model);
    }



    protected abstract void start();    //we only gave the essential info for all cars, (no details, no body), child class will complete this method with a body




    @Override
    public String toString() {
        return make + "{" +                  //we put make instead of car , and we do not need to override toString in child classes, this will be inherited
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
warmup tasks:
	1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886 (but year is final, it doesn't have setter ,so we can
					                                    write this condition in the constructor)
					2. price can not be less than negative or zero (but price is not final and has setter ,so
					                                                  we can write this condition in setter)

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Press the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

	2. Create the following subclasses of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						autoPilot()

 */