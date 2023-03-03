package day03_variables;

public class VariableNamingRules {
    public static void main(String[] args) {


        // age of the student is 28
        // salary is 10000

        int age = 28;
        int salary = 10000;
        //int salary = 12000; // variable name MUST be UNIQUE

        int ItemsOrdered = 45; // Camel case, otherwise gives us compiler
        double salaryBeforeTax = 100000.5;
        double salary_after_tax$ =800000.5; // underscore (_) and $ is only acceptable characters for variable names

        //int 5number = 45; // variable names can not start with a digit.
        int number5 = 45; // but they can have digits at the end
        int num4ber = 45; // is okay too but not readable
        int _num$ber45 = 67;

        String studentName = "Sefika Akin";
        System.out.println(studentName);


        //int static = 23; is giving a compiler because some of the words are reserved in java, for ex static, char, public etc.
    }
}