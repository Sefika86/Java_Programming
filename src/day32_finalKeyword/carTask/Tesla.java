package day32_finalKeyword.carTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car {

    //BASED ON THE REQUIREMENTS BELOW WE HAVE TO OVERRIDE 5 METHODS FROM CAR CLASS

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    public final void autoPilot(){  //if you do not want this method to be overridden by other car companies==> final it
        System.out.println(getMake() + getModel() + " ");
    }



    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + getMake() + " " + getModel());
    }


    @Override
    public void setModel(String model) {

      // String[] models =  {"Model S", "Model Y", "Model x", "Model 3" }; instead of using array why do not we use arraylist which has contains method

        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model x", "Model 3" ));

       if(! models.contains(model)){  //if specified model is invalid model
           System.err.println("Invalid Tesla model: " + model);
           System.exit(1);
       }else{
           super.setModel(model);  // this.model = model;
       }
    }


    @Override
    public void setColor(String color) {
       ArrayList<String> colors = new ArrayList<>();
       colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));

        if(! colors.contains(color)){
            System.err.println("Invalid Color");
            System.exit(1);
        }
        super.setColor(color); // this.color = color;
    }

    @Override
    public void setYear(int year) {
        if(year < 2008){
            System.err.println("year of the tesla can not be less than 2008");
            System.exit(1);
        }
        super.setYear(year);
    }


    @Override
    public void setPrice(double price) {
        if(price < 50000){
            System.err.println("Invalid price of tesla: " +price);
            System.exit(1);
        }
        super.setPrice(price);
    }










}




/*
5. Tesla
               		start(): "Say \"Start\""
	                Extra method:
	                	  autoPilot()
	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k
 */