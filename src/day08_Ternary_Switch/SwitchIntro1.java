package day08_Ternary_Switch;

public class SwitchIntro1 {
    public static void main(String[] args) {

        /*
    THIS TASK SOLVED BY MULTI_BRANCH AND NESTED IF. NOW WE WILL DO IT WITH SWITCH STATEMENT
        char grade = 'K';
        String  result = " ";

        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
                if(grade== 'A'){
                    result = " Excellent";
                } else if (grade == 'B') {
                    result = " Great Job";
                } else if (grade == 'C') {
                    result = "Good";
                } else if (grade == 'D') {
                    result = " Passed";
                }else {
                    result = "Failed";
                }
        }else{
             System.out.println("invalid");
        }
             System.out.println(result);
        */


    System.out.println("=================================================================");
     /*
     I need the compare the grades:
     A: Excellent
     B: Great Job
     C: Good
     D: Passed
     F: Failed
      */
        char grade = 'A';
        String result = " ";

        switch (grade) {

            case 'Q':
                result = "Excellent";
                break;                  // this break is the closing of case.

            case 'B':
                result = "Good Job";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;
            default:
                result = "invalid grade";   //default does not have to be at the end but its highly recommended

        }

        System.out.println(result);



    }
}
