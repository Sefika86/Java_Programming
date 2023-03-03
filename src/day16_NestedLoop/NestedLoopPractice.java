package day16_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

//******INTERVIEW TASK*****Find FREQUENCY OF CHARACTERS which appears twice in the string ****WITH NESTED LOOP*****

        String str = "aaabbccccddeeeeff";
        String result = " ";

        for (int j = 0; j < str.length() ; j++) {


            char ch = str.charAt(j); // first character of the string
            int count = 0;
            for (int i = 0; i < str.length(); i++) {  //i = each index numbers of str
                if (str.charAt(i) == ch) {  //if the character of the string is equal to given character(in this ex first ch),
                    count++;              //count it once
                }
            }
                                             //buraya sadece ch yazsak error verir cumku contain methodda senden charsequence(string) bekliyot
            if(count == 2 && !result.contains("" + ch)){  //if the character has appeared 2 times in our string ex: b, d, f
                                                     // and result does not contain it already for avoiding duplication
                result += ch;

            }

        }


        System.out.println("result = " + result);



    }
}
/*
Find, FrequencyOfAllCharacters:

			"AAABBCCCCDDDDD"

			output:
				A3B2C4D5
 */