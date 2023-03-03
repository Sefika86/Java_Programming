package day16_NestedLoop;

public class FrequencyOfAllChars {
    public static void main(String[] args) {
        String str = "AAABBCCCCDDDDD";
        String result = " ";



        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)){
                    frequency ++;
                }
            }

            if (result.contains("" + ch)){
                continue;
            }
            //result += ch + frequency; //boyle birakirsak ch nin asci nb alir
            result += ch + "" +  frequency;

        }


        System.out.println(result);

    }

}
/*


FrequencyOfCharacters:
        "AAABBCCCCDDDDD"

        output:
        A3B2C4D5
*/
