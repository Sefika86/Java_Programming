package day17_CustomClass;

public class UniqueChars1_warmUp {
    public static void main(String[] args) {
// we do this task with indexof and lastindexof methods but they are not
// universal so we will do the same task with nested loop in uniquecharacters2

        String str = "aabcccd";  //unique chars:b,d

        String unique = " "; // unique char leri eklemek icin bos bir container




            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (str.indexOf(each) == str.lastIndexOf(each)) {
                    unique += each;
                }

            }



        System.out.println(unique);

    }

}
/*
Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */