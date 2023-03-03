package day28_encapsulation.encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student student = new Student();

        // student.age = -200;  // we access the public  instance variable from Student Class




       // student.setAge(25);  //output : 25

        student.setAge(-200);

        System.out.println(student.getAge());    //for reading the age

        System.out.println("Test Completed");   //this won't execute because program got terminated with SYSTEM.EXIT(1)


        //student.name; // error because name is a private inst. variable

        //  student.setName("Aaron");

        System.out.println(student.getName());



    }


}
