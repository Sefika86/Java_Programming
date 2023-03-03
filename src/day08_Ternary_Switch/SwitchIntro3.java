package day08_Ternary_Switch;

public class SwitchIntro3 {
    public static void main(String[] args) {

   // for example is this task done by switch statement?
   // yes but you would end up with 100 different cases which is not preferred,
   //we prefer if statements with nested if- with ternary(if you want shorter codes) for this task
        int score = 85; // 0 ~ 100

        String result = "";

        if(score >= 90){ // false: score < 90
            result = "A";
        }else if(score >= 80 && score < 90){ //false: score < 80
            result = "B";
        }else if(score >= 70){ // false: score < 70
            result = "C";
        }else if(score >= 60 ){ // false: score < 60
            result ="D";
        }else{ // score < 60
            result = "F";
        }


       /* switch (score){
            case >= 80 && <= 90    impossible
        }
*/
        //-----------------------------------------------------------




    }
}
