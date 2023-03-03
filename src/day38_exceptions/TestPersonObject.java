package day38_exceptions;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 90, 'K');

        System.out.println(person1);


       // person1.setAge(-25);  //todo: we created a throw exception in custom class so the program crashed and exit code 1

        try {
            person1.setAge(-25);
        }catch (RuntimeException e){  //todo: then we handled the exception and program ended with zero, no issues
            e.printStackTrace();
        }

        System.out.println(person1);


    }
}
