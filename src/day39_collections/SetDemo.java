package day39_collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
//LIST

        List<Integer> list1 = new LinkedList<>();   //ACCEPTS DUPLICATES
        list1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list1.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list1);  //[10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        System.out.println("---------------------------------------------------------------------------------");
  //SET

//HashSet  class
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200));  //these will not be added, duplicates are not allowed
        set1.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set1);  //[null, 200, 40, 10, 90, 300]  sets maintain the random order
                                   //accepts null but no duplication


//LinkedHashSet class
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200));
        set2.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set2); //[10, 200, 300, 40, 90, null]
        //no duplicates, null is accepted but order is not random...


//TreeSet class
        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200));
       // set3.addAll(Arrays.asList(null, null, null, null));  NullPointerException

        System.out.println(set3);  //[10, 40, 90, 200, 300]
       // KEEPS SORTED ORDER(SMALLER TO BIGGER),no duplicates,  null is not accepted


        System.out.println("-------------------------------------------------------------");

        //question :remove the duplicates


        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        String result = " ";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(result.contains(words[j])){
                    continue;
                }
                result += words[j] +" ";
            }
        }
        System.out.println(result);

        //with set

        LinkedHashSet<String > result1 = new LinkedHashSet<>();
        result1.addAll(Arrays.asList(words));

        System.out.println(result1);  //[Java, Python, C#, C++, Ruby]  because LinkedHashList keeps the insertion order and does not allow to duplicates

   //set does not have index number so no get() method

        // System.out.println(result.get(1));  comp. error because set does not have index numbers so no get() method
/*
        for (String each : result1) {
            System.out.println(each);
        }

 */
        //but we can convert set to list to be able to use get() method:

        System.out.println( new ArrayList<>(result1).get(1));  //python

        //how to convert Set to Array
        words = result1.toArray(new String[0]);
        System.out.println("Words Array : " + Arrays.toString(words));


        System.out.println("----------------------------------------------------------");


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50,5, 5, 5, 1, 1, 1, 2, 2,2));

        Set<Integer> n = new TreeSet<>(numbers); // List to Set (IT WILL AUTOMATICALLY REMOVE THE DUPLICATES)

        System.out.println(n);


        // numbers = new ArrayList<>(n);
    }
}
