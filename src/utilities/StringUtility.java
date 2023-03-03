package utilities;

public class StringUtility {


    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;  //return statement should be outside of loop
    }


    //return the frequency of the given word from given sentence
    public static int frequency (String sentence, String word){
        int count = 0;

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }


    // frequency of a char in a given string
    public static int frequency ( String str, char ch){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }


    // method for Removing the duplicates from a string
    public static String removeDup(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(! result.contains("" +each)){
                result += each;
            }
        }
        return result;
    }







}
