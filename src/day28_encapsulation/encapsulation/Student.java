package day28_encapsulation.encapsulation;

public class Student {

    //public int age;  //any class can access it, I do not have any control on it, NOT secure


    private int age;     //other classes can not access it without getters&setter
    private String name;



    //GETTER method
    public String getName() {
        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }



    //SETTER method
    public void setName(String name) {

        boolean hasDigit = false;
        for (char each : name.toCharArray()) {

            if(Character.isDigit(each)){
                hasDigit=true;
            }
        }
        this.name = name;
    }



    public int getAge(){   //getter method helps us to read the private instance variable in another class
        if(age == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }



    public void setAge(int age){    //setter method helps us to modify(write) a private instance variable

        if (age < 1  || age > 100){    //if age is invalid
            System.err.println("Invalid Age: "+age);
           // return;  //-->exiting the method only
            System.exit(1);  //entire program gets terminated
        }


        this.age = age;
    }

}
