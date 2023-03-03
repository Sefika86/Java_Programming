package day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {


        double salary = 200000;
        boolean isMarried = true;

        double taxRate = 0;   //we assigned a temporary value for tax rate

        if (salary >= 130000) { //false: salary < 130000;
            taxRate = 0.35; //35%
        }

        if (salary < 130000 && salary >= 100000) { //false: salary < 100000;
            taxRate = 0.30; //30%
        }

        if (salary < 100000 && salary >= 80000) { //false: salary < 80000
            taxRate = 0.25; //25%
        }

        if (salary < 80000) {
            taxRate = 0.20; //20%
        }


        if (isMarried) { // if the person is married
            taxRate -= 0.05; // subtracting 5% from the original tax rate
        }

        double salaryAfterTax = salary - (salary * taxRate);  // or salary * (1-taxRate)
        double totalTax = salary * taxRate;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("Salary After Tax = " + salaryAfterTax);


    }
}
