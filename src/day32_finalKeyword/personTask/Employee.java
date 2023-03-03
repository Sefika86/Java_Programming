package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle;  //these extra variables for employee must be changeable so ==not final

    private double salary;


    public Employee(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);  //we called parent's constructor and added extra variables
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public void work(){
        System.out.println(getName() +" is working");
    }


    @Override
    public String toString() {
        return super.toString()+
                "jobTitle='" + jobTitle + '\'' +
                "salary='" + salary;
    }
}
