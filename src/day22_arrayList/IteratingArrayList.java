package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255);

        // numbers.add(300, 2000);  we can not add an element in index nb 300 before filling the previous indexes

        System.out.println(numbers); //{100, 200, 300, 255, 400, 500}

        System.out.println("-------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------");

        //reversed order

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------");

        //for each loop: but remember you do not access to indexes, only access to elements from first to last

        for (Integer each : numbers) {   //it is automatically Integer ,so we do not need an autoboxing step
            System.out.println(each);
        }


    }
}