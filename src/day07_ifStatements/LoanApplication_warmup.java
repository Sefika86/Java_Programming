package day07_ifStatements;

public class LoanApplication_warmup {
    public static void main(String[] args) {

        int salary = 55000,
            creditScore = 680;

        if (salary >= 45000 && creditScore >=700){
            System.out.println("You are eligible for a loan");
        }else{
            System.out.println("You are not eligible");
        }
    }
}
// this kind of tasks have 2 possibilities : eligible or not. so we use if & else statement.
// we can do it with a single print statement. String result = " "; methodu ile