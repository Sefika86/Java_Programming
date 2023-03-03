package day06_ifStatements;

public class IfAndElseStatementIntro {
    public static void main(String[] args) {

        //SINGLE IF STATEMENT
        int age = 28;

        if (age >= 21) {
            System.out.println("Eligible");
        }
        if (age < 21){
            System.out.println("Not Eligible");
        }
                                                    //OR
            System.out.println("--------------------------------------------------------------");

        //IF&ELSE STATEMENT
        int age2 = 28;

        if (age2 >= 21){
            System.out.println("Eligible");
        }else{ //OTHERWISE
            System.out.println("Not Eligible");
        }
    }
}
