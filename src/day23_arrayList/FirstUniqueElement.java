package day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {

          /*
   2. Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
    */


        ArrayList<Integer> list = new ArrayList<>();

        //until we cover addAll()method we have to add the elements one by one;

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);
        
        //we have to use nested loop to get the first unique element:


        for (Integer element : list) {

            int frequency = 0;
            for (Integer each : list) {
                if (each == element) {
                    frequency++;
                }
            }

            if (frequency == 1){
                System.out.println(element);  //this is all unique elements
                break;  // this break statement will exit the loop in order to give the first unique element
            }



        }


    }
}
