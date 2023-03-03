package day11_StringMethods;

public class StringMethods3 {
    public static void main(String[] args) {

        //replace() method (it will change all the matching ones) ...have to be assigned to be able to make changes
        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");  //it won't do this changes
        sentence = sentence.replace("language","dil");  //it will do this changes because this is last line
        String s1 = sentence.replace("love" , "seviyor");  //will do both line 10 and line 11
        System.out.println(sentence);
        System.out.println(s1);

        //ex

        String word = "java";

        // word = word.replace('a' , 'e');  //"jeve"

        word.replace("a", "e");

        System.out.println(word);

        //replaceFirst() method

        String sentence2 = "I love Java, Java is cool";

        //sentence2 = sentence2.replace("Java", "Python");

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);

        //ex--------------------------------------------------------

        String sentence3 = "Java is fun, Java  is cool, Java is amazing";

        //sentence3 = sentence3.replace("Java", "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python"); // for replacing the second 'java' in the string

        String s3 =sentence3.replaceFirst("is", "was");
        System.out.println(s3);

        System.out.println(sentence3);


        //substring() method-(this method excludes the ending index number ,so you have to add + 1)

        String sentence4 = "I love Java Programming";
        String languageName = sentence4.substring(7, 10 + 1);  //+1 is for including the 10th character too
        System.out.println(languageName);

        //ex
        String a ="I love Java";
        String b =a.substring(5, 8+1);
        System.out.println(b);

        //ex
        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //                  0123456789

        String today = sentence5.substring(9, 14+1);

        System.out.println(today);  //Sunday

        //----------------------------------------

        String email = "CydeoSchoolJavaProgramming@yahoo.com";

        int beginning = email.indexOf("@") + 1;   //yani @ten sonrasi
       // int ending = email.lastIndexOf('.');   //. ya kadar. we found the domain: yahoo


        String domain =  email.substring(2);

        System.out.println(domain);

        //ex------------------------------------

        String sentence6 = "I love Java programming";
                         // 0123456789
        //String r1 = sentence6.substring(7, sentence6.length());     or

       String r1 = sentence6.substring(7);

        System.out.println(r1);


        System.out.println("------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow =  sentence7.substring( sentence7.lastIndexOf(" ") + 1 );
        // create the substring "Monday" from sentence7. DO NOT count any index numbers

        System.out.println(tomorrow);

        System.out.println("------------------------------------");

        String str = "Python";

        String result = (str +"\n").repeat(10);

        System.out.println(result);



    }
}
