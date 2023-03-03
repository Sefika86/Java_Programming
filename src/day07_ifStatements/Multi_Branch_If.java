package day07_ifStatements;

public class Multi_Branch_If {
    public static void main(String[] args) {

    int num = 100;
    String result = " ";

    if (num > 0){
        result = "positive";
    } else if (num < 0) {
        result = "negative";
    }else{
        result ="zero";
        }

        System.out.println("result = " + result);


        System.out.println("===========================================================");

        //grade2 (lets do the task grade with multi branch if method this time.

        char grade = 'A';
        String result2 = "";

        if (grade == 'A'){
            result2 = "Excellent";
        }else if (grade == 'B'){
            result2 = "Good Job";
        }else if (grade == 'C'){
            result2 = "Good";
        }else if (grade == 'D'){
            result2 = "Passed";
        }else {
            result2 = "Failed";
        }

        // in this task we have 5 conditions so we should have if- else if- else if- else if- else...........
        //this is one multi branch if statement




    }
}
