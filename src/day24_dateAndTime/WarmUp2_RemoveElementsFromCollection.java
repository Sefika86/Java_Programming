package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp2_RemoveElementsFromCollection {

    public static void main(String[] args) {
//a student's solution in qa channel
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7,6, 2,9,3,4));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.set(i, 0);
            }
        }
        list.removeAll(Arrays.asList(0));
        System.out.println(list);


        System.out.println("-------------------------------------------------------------------");


        //Solution with RemoveIf method


        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7,6, 2,9,3,4));

        System.out.println(list2);

        list2.removeIf(p -> p < 4);

        System.out.println(list2);


    }
}
/*
Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */