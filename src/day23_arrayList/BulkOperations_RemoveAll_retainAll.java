package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_RemoveAll_retainAll {
    public static void main(String[] args) {

        //removeAll

        ArrayList < Integer > list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20));

        //remove all 10s and 20s.

        list.removeAll(Arrays.asList(10, 20));

        System.out.println(list);

        System.out.println("----------------------------------------------------------");

        //retainAll

        ArrayList < String > developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar", "Alena"));

        System.out.println(developers);

        developers.retainAll(Arrays.asList("Alena", "Khashayar"));

        System.out.println(developers);

        System.out.println("--------------------------------------------------------------------");

        ArrayList <String> groceriesList = new ArrayList<>();

        groceriesList.addAll(
         Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

        System.out.println(groceriesList);

        groceriesList.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));

        System.out.println(groceriesList);

        // OR

        groceriesList.removeAll(Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

        System.out.println(groceriesList);

    }
}
