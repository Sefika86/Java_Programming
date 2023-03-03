package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        // 1.assignment operators
        int x = 20;
        System.out.println(x);  // x=20

        x=40;
        System.out.println(x);  //x=40 (we updated the value x)

        // 2. addition assignment operations

        double balance = 100;
        balance += 1000; // we deposit 1000
        System.out.println("balance = " + balance);  //balance will be 1100.0
        balance += 500;
        System.out.println("balance = " + balance); // balance will be 1600.0

        // 3. subtraction assignment operations

        balance -= 200;  //we withdraw 200
        System.out.println("balance = " + balance); // balance will be 1400.0

        // 4. multiplication assignment

        double salary = 45000;
        salary *= 2;
        System.out.println("salary = " + salary); // the salary will be double . salary = 90000

        salary *= 3;
        System.out.println("salary = " + salary);

        // division assignment operators

        salary /= 4;
        System.out.println("salary = " + salary); //270000 / 4 =  67500

        // module ass. operators

        int b = 39;
        b %= 7;  // b= 39 % 7

        System.out.println("b = " + b);  // b=4 is the reminder




    }
}
