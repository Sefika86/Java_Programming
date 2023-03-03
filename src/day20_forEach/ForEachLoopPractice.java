package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {
        // find only odd numbers, you can use for loop or for each loop but for each is more
        // convenient here because initialization and iteration is already set.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {
            if (each % 2 != 0) {
                System.out.println(each);
            }
        }


        System.out.println("-----------------------------------------------------------------");

        int[] nums = {100, 20, 30, 40, 5, 4, 3, 1, 2, 1000, 300, 500};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {
            if (each > max) {
                max = each;
            }
        }

        System.out.println("max = " + max);

        for (int each : nums) {
            if (each < min) {
                min = each;
            }
        }

        System.out.println("min = " + min);

        System.out.println("-----------------------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100, 110, 120};  //we will to merge this with for each loop this time

        int[] a3 = new int[a1.length + a2.length];

        System.out.println(Arrays.toString(a3)); // bu sekilde sadece  toplam element sayisi kadar 0 copy yapmis olursun,
        // merge yapmak icin for loop or for each loop kullanmak zorundasin

        int k = 0; // pretend that this k is index numbers of a3

        for (int each : a1) { // for each loop for a1
            a3[k++] = each; // a1 in her bir elementini one by one a3 e ekle
        }

        for (int each : a2) {  // for each loop for a2
            a3[k++] = each;
        }

        System.out.println(Arrays.toString(a3)); // simdi a1 ve a2 nin elementlerini yeni bir array(a3) e copy yaptik

        System.out.println("-----------------------------------------------------------------");

        String[] names = {"Mohammad Karimi", "Vasyl Dobrianski", "Gadir Ibrahimov", "Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0) +"."+each.charAt( each.lastIndexOf(" ") +1) );
        }



    }
}
