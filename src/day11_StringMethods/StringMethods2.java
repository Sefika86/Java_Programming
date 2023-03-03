package day11_StringMethods;

public class StringMethods2 {
    public static void main(String[] args) {
//toUpperCase and toLowerCase methods

//ex

        String str1 = "CYDEO SCHOOL";
        str1 = str1.toLowerCase();
        System.out.println(str1);

//ex

    String str2 = "java programming";
   // str2.toUpperCase();  this will not change our string to upper case.
   // we have to create a new string object by assigning it to a variable

        str2= str2.toUpperCase(); //now we assigned it ,so it will turn our existing string to upper case
        String str3 = str2.toUpperCase();  //or here we can create another variable to store our uppercase string
        System.out.println(str2);
        System.out.println(str3);   //they are both uppercase

//ex
        String word = "Wooden Spoon";
        word.toUpperCase(); //this won't change anything, because strings are immutable

        word= word.toLowerCase(); // but we assigned it here so it will convert all letters to lowercase

        System.out.println(word);

        System.out.println("--------------------------------------------------------");
//trim() method

        String str4 ="        Cydeo School";
        str4 =str4.trim();
        System.out.println(str4);   //will delete all white spaces ,but no spaces between words

        System.out.println("--------------------------------------------------------");
// indexOf() method  (from left to right)
// ex
        String sentence1 ="Today is Sunday, and we have Java Class";
        int index1 = sentence1.indexOf('w');
        System.out.println(index1);  //the first w in our string is the 21st character
//ex
        String s1 ="I love java programming";
        int firstA = s1.indexOf('a');  //if we are looking for one character use ' '
        System.out.println(firstA);
        int secondAwithspace = s1.indexOf("a "); // if we are looking for two characters use ""
        System.out.println(secondAwithspace);

//ex
        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        System.out.println(a1);    //1

        int a2 = s2.indexOf("va");
        System.out.println(a2);    //2

        int a3 = s2.indexOf("av");
        System.out.println(a3);     //1

        int a4 = s2.indexOf("ipt ");
        System.out.println(a4);     //19

        int a5 = s2.indexOf("avaS");

        System.out.println(a5);    //13

        System.out.println("--------------------------------------------------------");

// lastIndexOf() method  (from right to left)
    //ex
        String w = "Java";
        System.out.println(w.indexOf('a'));  //even we did not assign it in to an int variable, it returns to int
        System.out.println(w.lastIndexOf('v'));  //from right to left //2

    //ex
        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P'));

    }
}
