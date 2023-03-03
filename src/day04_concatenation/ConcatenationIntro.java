package day04_concatenation;

public class ConcatenationIntro {

    public static void main(String[] args) {
        
        
        String name = "Melike";
        int age = 35;
        int salary = 85_000;   // underscore is allowed between the numbers to make it more readable
        int number = 100_000_000; // one hundred million, we made it more readable with underscores.
        System.out.println("Hello I am " + name + " and I am " + age + " years old.");
        System.out.println("My salary is "+ salary + " USD.");
        System.out.println("number = " + number);

    }

}
