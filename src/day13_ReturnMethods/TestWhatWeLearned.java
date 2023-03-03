package day13_ReturnMethods;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestWhatWeLearned {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  //we can assign it into a variable because the method return type is int
        // keep clicking on ctrl and click on your method, it will show you the return type

        //double n2 = input.close();  //compile error because .close() method is a void method, we can't use it for assigning it into a variable

        //String word = System.out.println("Hello"); // compile error, because .println method's return type is void, we can not assign it into a variable.
        //its only used as a data

        String str = "Java";
        str = str.toLowerCase();


}
}
