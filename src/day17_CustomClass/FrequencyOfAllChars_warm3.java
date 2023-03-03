package day17_CustomClass;

public class FrequencyOfAllChars_warm3 {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = " ";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);  //buraya 0,1,2,3 hangi index nb. yazarsan o karakterin frequency sini bulur
            int count = 0; // bu surekli degisecek

            for (int i = 0; i < str.length(); i++) {

                if (ch == str.charAt(i)) {
                    count++;
                }
            }

            if(result.contains("" + ch)){
                continue;  //skip it
            }


            result += ch + "" + count;
        }


        System.out.println(result);


    }
}
/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */