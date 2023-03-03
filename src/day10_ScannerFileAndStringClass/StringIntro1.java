package day10_ScannerFileAndStringClass;
import java.util.Scanner; //this is the import statement for scanner class

public class StringIntro1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //this is the object of scanner. We do not need
        String str = "Java"; // this is an object of string created by String literal(any string of text between double quotes)

        System.out.println();

        input.close();

        System.out.println("----------------------------");


        String s1 = "Cat";    //If we have more than one string literals that have same data in them,
                              // only one data is stored in the string pool in the heap
        String s2 = "Dog";

        String s3 = "Cat";

        String s4 = "Cat";

        System.out.println(s1 == s3);   //true
        System.out.println(s1 == s4);   //true
        System.out.println(s3 == s4);   //true

        System.out.println("----------------------------");

        String str1 = new String("Java"); // object of string by "New" Keyword
        String str2 = new String("Java"); //Creates two objects: 1. String pool, 2. in heap (outside string)

        System.out.println( str1 == str2);  //false, because each object creates its own new memory in the heap outside
                                             // of string pool so they are not same


        System.out.println("----------------------------");

        String t1 = "Python";   //An object of string by string literal
        String t2 = new String("Python");  //objects by 'new' keyword
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);


        System.out.println(t1 == t2);
        System.out.println(t3 == t2);





    }

}
