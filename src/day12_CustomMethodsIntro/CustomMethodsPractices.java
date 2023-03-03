package day12_CustomMethodsIntro;

public class CustomMethodsPractices {


    public static void main(String[] args) {

        eligible(21); //eligible method below

        oddEvenZero(0);  //oddEvenZero method below

        gradeOfStudent(54); //gradeOfStudent method below

        maxNumberOrEqual(56, 78);  //maxNumberOrEqual method below

        initial("Sefika", "Akin");  //initials method below
        initial("Mahmut", "Muhtar");

    }


    // now create another custom method to check if a person is eligible to buy alcohol(age)
    public static void eligible(int age) {

        if (age >= 21) {
            System.out.println("eligible to buy alcohol");
        } else {
            System.out.println(" not eligible to buy alcohol");
        }

    }


    //now create a method that can check if a number is odd or even or zero(number)
    public static void oddEvenZero(int num) {
        if (num % 2 == 0 && num != 0) {
            System.out.println(num + "  is even number");
        } else if (num % 2 != 0) {
            System.out.println(num + " is odd number");
        } else {
            System.out.println("the number is zero");
        }

    }


    //now create a method that can calculate the grade of the students(score)
    public static void gradeOfStudent(double score) {

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Very Good");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("the score is invalid");
        }


    }


    //create a method that can print the max number between two numbers, if both are equal then print "equal"
    public static void maxNumberOrEqual(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        } else if (num1 < num2) {
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("the numbers are equal");
        }

    }


    //create a method that can display the initials of a person. we will need two parameters, first and last name
    public static void initial(String firstName, String lastName) {

        firstName = firstName.substring(0, 1).toUpperCase();
        lastName = lastName.substring(0, 1).toUpperCase();

        System.out.println("the initial is: " + firstName + lastName);

    }


}
