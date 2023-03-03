package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public class CydeoDevStudent extends Person {

    private final String id;   //final variables do not have default value, so compile error until we initialize it in constructor
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage;  ////final variables do not have default value, so compile error until we initialize it in static block.


    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);

        if(getAge() < 18){
            System.err.println("Cydeo Developer Student must be at least 18 years old");
            System.exit(1);
        } //age is final in parent class so only place we can add conditions here is in constructor

        this.id = id;   //because its final
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }


    static{
        programmingLanguage = "Java";
    }



    //final instance variables do have only getter but not setter, because setter is used for changing the values
    //but final means unchangeable


    public String getId() {
        return id;
    }



    public String getBatchName() {
        return batchName;
    }



    public int getBatchNumber() {
        return batchNumber;
    }



    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("Zero to Hero") || batchName.equalsIgnoreCase("Alumni Dev") ){
            this.batchName = batchName;
        }else{
            System.err.println("Invalid Batch Name: " +batchName + " \n No such a batch in Cydeo");
            System.exit(1);
        }
    }



    public void setBatchNumber(int batchNumber) {
        if(batchNumber <=0 ){
            System.err.println("Batch number can not be negative or zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating " +programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage);
    }


    @Override
    public void sleep() {
        System.out.println(getName() + " does not need to sleep");
    }



    //breath method can not be overridden, it is final in person class


    @Override
    public String toString() {
        return super.toString() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", Programming Language='" + programmingLanguage + "'";
    }


    //muhtar creates the to string by generating a new to string and copy-paste parents class variables by get()
    //I did from generate==> override methods==> toString, and add subclasses extra variables
    // (but in parent, I changed the class name to getClass().getSimpleName())
}

/*
Warmup tasks:
	1. Create a subclass of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables



 */