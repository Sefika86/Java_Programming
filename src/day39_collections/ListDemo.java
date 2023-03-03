package day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();  //Array Based Class ==>retrieving ( get() ) is faster
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);

        arraylist.remove(0);

        arraylist.get(0);

        System.out.println(arraylist);

        System.out.println("---------------------------------------------------------------");

        LinkedList<Integer> linkedList = new LinkedList<>(); //Node based class(doubly linked list) ==> increasing & decreasing is faster

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println(linkedList);

        System.out.println("---------------------------------------------------------------");

        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);

        System.out.println("---------------------------------------------------------------");


        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);

        int lastElement = stack.pop();

        System.out.println(stack);

    }
}
