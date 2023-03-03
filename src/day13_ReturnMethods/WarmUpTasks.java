package day13_ReturnMethods;

public class WarmUpTasks {
    public static void main(String[] args) {

        calculator(2.5, 5.5, '*');

        ageGroup(43);


    }

    public static void calculator(double num1, double num2, char mathOperator){

        switch (mathOperator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("invalid Operator");
        }




    }


    public static void ageGroup(int age){

     if (age >0 && age <=150) {

         if (age < 21) {
             System.out.println("Teenager");
         } else if (age <= 55) {
             System.out.println("Adult");
         } else {
             System.out.println("Senior");
         }
     }else{
         System.err.println("invalid age");
     }





    }




}





/*
Warmup task:
	1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote


 */