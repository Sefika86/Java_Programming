package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // Data Type  Variable Name = Data;
        // byte ONLY accepts integer values (-128 to 127)
        // byte b = 8.4; it gave me a compiler here because byte can not be a decimal number, it should've been a double
        // price of car is $17500

        byte a = 8;
        short p = 17500;

        System.out.println("p");
        System.out.println(p);
        System.out.println("a");
        System.out.println(a);

        //salary is $95000
        int s = 95000;
        System.out.println("s");
        System.out.println(s);

        //int n1 = 9999999999; cant be possible
        //long n2 = 9999999999; //gives compiler why?
        long n3 = 999999999999L; //is good
        //because for the numbers which bigger than int range value we still need to put L at the end of the number,
        // to remind java that this nb is a long integer because int is the preferred data type for integers.
        System.out.println(n3);

        System.out.println("--------------------------------------------------");

        // gpa for a student is = 3.5
        double gpa1 = 3.5;   //double id the preferred data type for the decimals
        //float gpa2 = 3.5;    // this gave a compiler (will explain better in primitive castings.)
        float gpa3 = 3.5F;
        System.out.println("----------------------------------------------------");

        // char designed for the single characters.
        char h = 36; // 36 is the assigned nb for the character $ in ASCII table
        char h1 = '$';
        System.out.println(h);

        System.out.println("---------------------------------------------------");

        // char can also
        int sum = 'A' + 'B'; // 65 is A and 66 is B in ascii table
        System.out.println(sum); // so this will be 131 on the console

        int total = '%' + '#';
        System.out.println(total);
        // it gives 72, the total numbers of # and $ in ascii table

        System.out.println("----------------------------------------------------");

        //boolean is for true/false, if you give boolean for an integer or a decimal you get compiler.

        boolean r1 = true;  // should be in lower case, you cant give any nb, word or character for boolean data type.
        boolean r2 = false; // but you can give any expressions that evaluated as true or false. For ex:
        boolean r3 = 100 > 10; // true so it didn't give us any compiler.
        boolean r4 = 0 < -1; // false

        System.out.println(r3);
        System.out.println(r4);

    }


}
//if you give the variable name in "double quotes" you see the title only, but you do not see the given data on console
