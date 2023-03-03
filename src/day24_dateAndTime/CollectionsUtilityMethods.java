package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        //replaceAll() method & frequency() method


        //Que: replace all Java with Python
        //we shouldn't use for each loop with set() method????,
        // we should use for loop in order to access each index numbers???? anlamadim


        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

          /*
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i, "Python");
            }
        }

 */ // instead of doing it like this try to do it with replaceAll method

        Collections.replaceAll(names, "Java", "Python");

        System.out.println(names);


        System.out.println("---------------------------------------------------------------");

//frequency() method
        //que: find the frequency of element 50

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        int count = Collections.frequency(list, 50);

        System.out.println(count);  // 8 50s in the list

        System.out.println("--------------------------------------------------------------------------------");

        //another ex: find the frequency of "Java"

        ArrayList<String> words = new ArrayList<>();

        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countJava = Collections.frequency(words, "Java");

        System.out.println(countJava);


   //note: if we want to find every single elements frequency in a collection, we have to use frequency method in a loop


        System.out.println("-----------------------------------------------------------------------------------");

//another ex: find the unique elements in the collection

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 20, 30, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));


        for (Integer each : numbers) {
            if( Collections.frequency(numbers, each) ==1 ){  //if the frequency of element is only one that element is unique
                System.out.println("Unique Element: "+ each);

            }
        }



    }
}
