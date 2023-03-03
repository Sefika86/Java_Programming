package day17_CustomClass;

public class UniqueChars2_nestedLoop {
    public static void main(String[] args) {


        // this is the universal way to finf the unique characters in a string,
        // find if first char is unique with char ch = str.charAt(0);

        String str = "aabcccd";
        String unique = " "; // tum unique karakterleri bu container a dolduralim


        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j); // first character of the string
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {  //checks how many times the ch has appeared in string
                if (str.charAt(i) == ch) {  //if ch has appeared in string
                    frequency++;  // increase the frequency by 1
                }
            }

            if (frequency == 1) {  //if the frequency is one then it's unique
                unique += ch;
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