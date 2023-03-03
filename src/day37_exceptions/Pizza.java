package day37_exceptions;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.err.println("Invalid size: "+size);

        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }

/*
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)) {
            System.err.println("Invalid object: " + obj);
            System.exit(1);
        }

        //reference type decides what variable we can call
        //size and numberOfPepperoniTopping not in Object(ref type) class ,so we have to do polymorphism(downCasting)


        if(size == ((Pizza) obj).size){
            if(numberOfPepperoniTopping == ((Pizza) obj).numberOfPepperoniTopping){
                return true;
            }
        }
        return false;
    }

 */

   //OR we can assign the downCasting into a variable if we have to do downCasting more than one

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Pizza) ){
            System.err.println("Invalid object: " + obj);
            System.exit(1);
        }

        Pizza pizza = (Pizza) obj;  // means: if the obj is Pizza I can assign the casting into a variable
                                    //now parameter obj and pizza variable referencing the same thing

        if(size == pizza.getSize()){  //does not matter to use getSize or size in this parent class
            if(numberOfPepperoniTopping == pizza.getNumberOfPepperoniTopping()){
                return true;
            }
        }
        return false;
    }
}
/*
warmup tasks:
	1. Create a class named Pizza
			variables:
				size (char), numberOfCheeseTopping, numberOfPepperoniTopping

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				calcCost(): returns the total cost of the pizza

			Override toString method to print Pizza object info when the object is passed in the print statement

			Override equals method that returns true if the pizza object is equal to the specified pizza object

 */