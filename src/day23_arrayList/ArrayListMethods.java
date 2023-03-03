package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(nums));

        nums[0] = 100;  //this is how we can update an element in arrays

        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------------------------------");


        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");
        System.out.println(groceriesList);

        groceriesList.set(2, "Oranges");  // this is how to update an element in ArrayList

        System.out.println(groceriesList);

        //we can update an element with add() method too ,
        //but it increases the size of the ArrayList by shifting the old element to the right

        groceriesList.add(2, "Chicken");

        System.out.println(groceriesList);

        System.out.println("----------------------------------------------------------");


        groceriesList.remove(0);  //index nb 0 will be removed and index nb 1 will be moved to the left
        System.out.println(groceriesList);  //eggs will be removed

        // Or the other form of the remove() method

        groceriesList.remove("Paper Towels");
        System.out.println(groceriesList);

        //but if the ArrayList is not string you can remove an element as an Integer Wrapper object
        //ex

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  //0
        numbers.add(20);  //1
        numbers.add(30);  //2
        numbers.add(40);  //3
        numbers.add(50);  //4

        boolean r1 = numbers.remove(Integer.valueOf(10));

        System.out.println(numbers);

        System.out.println(r1);

        //if you want to get empty this ArrayList:

        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("----------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl"));         //0
        System.out.println(names.lastIndexOf("Vasyl"));   //1 ==>because last time this name appeared on index 1
        System.out.println(names.lastIndexOf("Sumeye"));  //5

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");
        System.out.println(hasMuhtar);   //false
        System.out.println(hasAli);      //true

        System.out.println("----------------------------------------------------------------------");


        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = list1;  //we referenced the list1 and list 2 each other

        list1.add(10);  //so this element will be assigned into both list1 and list2

        System.out.println(list1);  //10
        System.out.println(list2);  //10
        boolean isequal = list1.equals(list2);
        System.out.println(isequal);   //true

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        boolean isEqual = l1.equals(l2);
        System.out.println(isEqual);  //true because equals method compares if they have same elements

        l1.add(10);
        l2.add(10);

        System.out.println(l1.equals(l2)); //true

        System.out.println("----------------------------------------------------------------------");


        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println(n1.equals(n2));  //false because order of elements are also important

        System.out.println("----------------------------------------------------------------------");

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());  //true
        System.out.println(n2.isEmpty());  //true






    }
}
