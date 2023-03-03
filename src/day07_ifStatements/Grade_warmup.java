package day07_ifStatements;

public class Grade_warmup {
    public static void main(String[] args) {
        char grade ='B';
        String result = " ";

        if (grade == 'A'){
           result = "Excellent";
        }
        if (grade == 'B'){
            result = " Great Job";
        }
        if (grade == 'C'){
            result = " Good";
        }
        if (grade == 'D'){
            result = "Passed";
        }
        if (grade == 'F'){
            result = "Failed";
        }
        System.out.println(result);
    }
}
// this task done with a single print statement by giving an empty string, but after
// learning multi_branch and nested if and even switch statement, this method won't be a good
// practice anymore