package day33_abstraction.employeeTask;

public class Driver extends Employee {
    //would you like to create objects of this class later on? if yes then do not abstract it




    public Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }



    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }
}
