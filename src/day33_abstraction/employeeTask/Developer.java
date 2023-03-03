package day33_abstraction.employeeTask;

public class Developer extends Employee{


    private String programmingLanguage;


    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    //until we override the abstract methods of parent class in this subclass, it will be compile error even we call the
    //constructor of parent class
    //if we abstarct a class we can never create objects of that class, so we do not abstract this child

    @Override
    public void work() {
        System.out.println(getName() + " is coding in " +programmingLanguage );
    }


    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", programmingLanguage=" + programmingLanguage +"}";
    }
}
