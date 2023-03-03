package day06_ifStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {
        //ex
        System.out.println(5 + 2 * 3);  //precedence of these operators are: *, +
        System.out.println( 7 + 3 - 2 / 2);  // precedence: /, +, - (if operators are at the same precedence, then which ever come first , its calculated first)


        //ex
        System.out.println(-5 + 3);   // -2


        //ex
        System.out.println( 10 > 9 == 8 < 7); //precedence of these operators:  which ever comes first: >, < and equal operator,
                        //    true  ==  false  is wrong so result is false


        //ex
        System.out.println( 10 > 9 == 8 < 7  && "java" == "python");  //false
                    //       true      false            false

        //ex
        System.out.println( 10 > 9 == 8 < 7  && "java" == "python" || 'a' == 'A');  //false
                    //            false      &&      false         ||  false

        //ex
        System.out.println( 100 >= 20 && 40 * 2 > 60); //true (solution in my note book)

        //ex
        int a = 20;
        a += 10 + 2 * 3;
        System.out.println(a); //
        // precedence : *, +, +=
        //a += 10 + 6
        //a += 16
        //a = 36



    }
}
