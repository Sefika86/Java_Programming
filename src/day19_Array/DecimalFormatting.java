package day19_Array;

import java.text.DecimalFormat;

public class DecimalFormatting {
    public static void main(String[] args) {
        //DecimalFormat class is represented in java.text package

        DecimalFormat df = new DecimalFormat("0.000");
        double n1 = 10.587654;

        System.out.println("n1: " + df.format(n1));  //10.588


    }
}
