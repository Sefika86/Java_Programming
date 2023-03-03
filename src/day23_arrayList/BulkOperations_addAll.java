package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_addAll {

    public static void main(String[] args) {

        //addAll() method


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // list1.addAll(numbers);

        // System.out.println(list1);   // [1,2,3,10,20,30,40]

        list1.addAll(1, numbers);
        System.out.println(list1);    //[1,10,20,30,40,2,3]


        System.out.println("--------------------------------------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 95, 70, 80));

        System.out.println(scores);


        //another addAll example with String ArrayList

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));

        System.out.println(students);

        //mesela index 2 den itibaren bikac isim daha eklemek istiyorsun: call the other form of the addAll
        students.addAll(2, Arrays.asList("Shukur", "Sumeye", "Tatiana"));
        System.out.println(students);

        System.out.println("--------------------------------------------------------------------------------");

        //we can also use asList method to convert a non-primitive array to an ArrayList

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};   //this is a non-primitive array

        ArrayList <Integer> l1 = new ArrayList<>();

        l1.addAll(Arrays.asList(nums));

        // OR
        //ArrayList <Integer> l1 = new ArrayList<>(Arrays.asList(nums) );  ===> without using addAll ,but it implicitly uses it

        System.out.println(l1);


    }
}
