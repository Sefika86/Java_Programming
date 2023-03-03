package day04_concatenation;

public class ArithmeticOperators {
    public static void main(String[] args) {

        //addition and substraction (same in math and java (do not give the numbers in "")
        System.out.println("100" +"200"); // you will see 100200 on the console bc you write them as string of text.
        System.out.println(100+200); // 300 because they are written as numbers


        // Division (different in math and in java)
        System.out.println(50 / 6);  //result is 8 bc int/int=int
        System.out.println(50 / 6.0); // result will be decimal bc int / decimal = decimal or
        System.out.println(50.0 / 6);
        System.out.println(50d / 6 );
        System.out.println(50 / 6d); // all same results
        System.out.println(2.5 / 0.5); //even result is integer in math , in java it will give us 5.0 but:
        System.out.println ((int) (2.5 / 0.5)); //if you put (int) before the equation you get integer result, parantezlere dikkat
        System.out.println(0/9); //numerator can be 0 but denominator can not , it gives error
        //System.out.println(9/0); //result will be error

        //multiplications; same in java and in math
        System.out.println(56*2);
        System.out.println(3.7*8.9);
        System.out.println(9*9.6);

        //modules (calculating the reminders in java)
        System.out.println(100 % 13); // 100 - ( 13 * 7) =9


    }
}
