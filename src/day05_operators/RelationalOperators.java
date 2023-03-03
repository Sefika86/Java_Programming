package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {
       //ex
        int a = 1000,
            b = 200;
        System.out.println(a > b ); // output will be true
        System.out.println(a < b);  // output will be false

        //ex
        int score = 75;
        boolean passed = score >= 60;
        System.out.println(passed); //output will be true

        //ex
        int age = 21;
        boolean eligibleToBuyAlcohol = age >= 21;
        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote);
        System.out.println("----------------------------------------------");
        //or we can give known numbers instead of using boolean numbers and unknown numbers
        //ex
        System.out.println(100>100);  //false
        System.out.println(100>=100);  //true
        System.out.println(100>=85);   //true

        System.out.println("--------------------------------------------------");
        score = 48;
        boolean failed = score < 60;

        System.out.println(failed);

        System.out.println("--------------------------------------------------");
        // what if we give given numbers
        System.out.println(100 < 2000); //true
        System.out.println(100 < 20);  //false

        //important
        System.out.println(95 <= 100); //true because as soon as the first condition (<) is true that's considered as true
        System.out.println(100 <= 100); //true
        System.out.println(10 <= 5);    //false

        System.out.println("--------------------------------------------------------");
        System.out.println('a' > 'b');
               //           65 > 66

        //System.out.println("java" > "c#");  gives compiler because relational operators are only applicable for numbers.

    }
}
