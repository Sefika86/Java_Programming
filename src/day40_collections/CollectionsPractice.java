package day40_collections;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {


        //when we do polymorphism, we have to be careful that reference type deciding the correct object type

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));

        System.out.println(((ArrayList) collection).get(2));    //==>downCasting, because collection ref type does not have get() method


        System.out.println("----------------------------------------------------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();  //if the order does not matter , use HashSet
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection2);  //[400, 100, 500, 200, 600, 300, 700]  hashset removed the duplicates

        //   System.out.println(  ( (ArrayList)collection2 ).get(4)  );  we can not cast Arraylist to a Hashset obj. they do not have is a rel.
        //so how we can use get() method with this Hashset(normally set does not have get() ).
        //we can use ArrayList one time use only

        System.out.println(  new ArrayList<>(collection2).get(4)  );  //600

        List<Integer> l = new ArrayList<>(collection2);

        System.out.println(l);



    }
}