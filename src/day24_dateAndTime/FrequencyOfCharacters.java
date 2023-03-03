package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbccccc";

        String result = " ";  //a3b4c5

        //str.split(""); // simdi burda split method ile "" empty space den elementlerine ayirip arraye cevirdi ve
                             // hemen aninda .for yapip for each loop cagirdi
//sonra hemen for being able to use frequency method we have to convert array to ArrayList which is a collection type
// peki nasil: Arrays.asList(ArrayN ame)==> ArrayList(collection)

        for (String each : str.split("")) {
           int frequency =  Collections.frequency( Arrays.asList(str.split("")), each);

           if(! result.contains(each) ){
               result += each + frequency;
           }
        }

        System.out.println(result);
    }
}
