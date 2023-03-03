package day08_Ternary_Switch;

public class TernaryIntro1 {
    public static void main(String[] args) {

        int score = 85;
        String result;

        if (score >= 60) {
            result = "Passed";
        }else{
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("==================================================");

// now lets do the same task with a ternary operator.
// opposite of normal if statement ,this time we will the condition first.

        String result2 = score >= 60 ? "passed" : "failed";
     //    variable      condition   if        else

        System.out.println(result2);


        System.out.println("==================================================");

        //ex

        int age = 34;
        String r;
        if (age>= 21){
            r ="eligible";
        }else{
            r ="not eligible";
        }

        //this entire multi lines can be converted to a single line with a ternary.

        String r2 = age >= 21 ? "eligible" : "not eligible";




    }
}