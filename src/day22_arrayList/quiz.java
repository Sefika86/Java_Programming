package day22_arrayList;

import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {

        int wd = 0 ;
        String [] days = {"Sun", "Mon", "Wed", "Sat"};
        for (int i = 0; i < days.length; i++) {
            switch(days[i]){
                case "Sat":
                case "Sun":
                    wd -= 1;
                    break;
                case "Mon":
                    wd += 1;
                case "Wed":
                    wd += 2;
            }
        }

        System.out.println(wd);


        int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));


        int[] num1 = new int[3];
        int[] num2 = {1,2,3,4,5};
        num1 = num2;
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num1[i]);
        }



    }
}
