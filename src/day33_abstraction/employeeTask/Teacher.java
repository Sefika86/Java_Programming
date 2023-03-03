package day33_abstraction.employeeTask;

public class Teacher extends Employee {  //compile error--> until this child class calls parent class constructor


    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
