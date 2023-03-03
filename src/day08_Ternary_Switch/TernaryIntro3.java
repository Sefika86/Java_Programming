package day08_Ternary_Switch;

public class TernaryIntro3 {
    public static void main(String[] args) {

        //now we will learn how to do nested if with Ternary.
        // this is how we did this task with if&else and nested if:
 /*
        int score = 130;
        String result = "";
        if(score >= 0 && score <= 100){
            if(score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);
*/

        int score = 130;
        String result = (score >= 0 && score <= 100)?

                      (score >= 60)? "Passed" : "Failed"

                        : "invalid";

                 System.out.println(result);


    System.out.println("================================================================");

//ex


        int n = 8;

        String day =(n >=1 && n <=7) ?   //nested if opening

                (n == 1) ? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday" :(n==4)? "Thursday"    //multi branch if
                :(n==5)? "Friday" :(n==6)? "Saturday" : "Sunday"

                : "NO SUCH A DAY";      // nested if closing

        System.out.println("day = " + day);


// as we see nested if-ternary is not as readable as normal nested if so its not the preferred method.



    }

}
