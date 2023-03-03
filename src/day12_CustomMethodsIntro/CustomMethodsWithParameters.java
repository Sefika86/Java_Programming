package day12_CustomMethodsIntro;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddOrEven(5);
        System.out.println("--------------------------");
        oddOrEven(10000);


    }


    //this custom method that we created takes an argument, and verifies if the number is odd or even number.
    public static void oddOrEven(int number){

        if (number % 2 ==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }








    }



}
