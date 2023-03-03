package day40_collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();  //order is random, does not accept null
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue1.addAll(Arrays.asList(null, null, null, null));   nullPointerException

        System.out.println(queue1);

        int num1 = queue1.poll();   //==> FIFO, first element will be removed

        System.out.println(queue1);

        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);

        System.out.println("--------------------------------------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>();  //keeps insertion order

        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);  //now empty


        System.out.println("-------------------------------------------------------------------------------");

        Queue<Integer> queue3 = new LinkedList<>();   //only diff from ArrayDeque, LinkedList is not a queue , it is a list and ACCEPTS null

        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(null, null, null, null));

        System.out.println(queue3);

        queue3.poll();

        System.out.println(queue3);


        System.out.println(( (LinkedList) queue3).get(2));   //casting queue to LinkedList to be able to call get(), because Queue does not have index, but List does


        System.out.println("-------------------------------------------------------------------");

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);

        System.out.println(list.get(1));  //200

        //this is a list. ref type is List , obj type is linked list. How can be able to call poll() method?
        //by casting it to LinkedList because linkedList has a relationship with queue

        System.out.println(list);

        System.out.println(((LinkedList) list).poll());










    }
}
