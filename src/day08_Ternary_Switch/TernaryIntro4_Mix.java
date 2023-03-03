package day08_Ternary_Switch;

public class TernaryIntro4_Mix {
    public static void main(String[] args) {
        //GradeReport Task: this time we will make it with a normal nested if and
        // a ternary multi_branch if

        int score = 120;
        String result =" ";

        if (score >=0 && score<=100) {


            result = (score>= 90) ? "A" :(score >=80)? "B" :(score >=70)? "C" :(score>=60)? "D"
                    : "Failed";

        }else{
            result = " invalid result";
        }

        System.out.println(result);



    }
}
