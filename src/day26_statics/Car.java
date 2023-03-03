package day26_statics;

public class Car {

    public String make;
    public String model;
    public int year;
    public double price;
    public String color;


    public Car(String make) {
        this.make = make;
    }


    public Car(String make, String model) {
        this(make);   // we call the first constructor at the first step
        //// this.make = make; ===>  so we do not need this duplicate line we will delete it ,
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make, model);  //we called the previous cons so delete the next 2 unnecessary lines
        this.year = year;
    }

    public Car(String make, String model, int year, double price) {
        this(make, model, year);  //we called the previous cons. so deleted the next 3 lines

        this.price = price;
    }


    public Car(String make, String model, int year, double price, String color) {
        this(make, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
class name: Car
		 instance variables:
		 		make, model, year, price, color

         Overloaded Constructors:
	 		1st constructor: initializes the make ONLY

	 		2nd constructor: initializes make & model
	 				(MUST use constructor call to set the make)

			3rd constructor: initializes make, model, year
					(MUST use constructor call to set the make, model)

			4th constructor: initializes make, model, year, price
					(MUST use constructor call to set the make, model, year)

			5th Constructor: intializes all the instances
					(MUST use constructor call to set the make, mode, year, price, color)


		instance methods: toString


 */