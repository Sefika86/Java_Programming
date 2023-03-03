package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {

        //add() / size() / get() Methods:

        ArrayList<Integer> list = new ArrayList<>();

        //  indexes
        list.add(10);   //0
        list.add(20);   //1
        list.add(30);   //2
        list.add(10);   //3

        //list.add(5.5);  //gives us compile error, data type does not match with wrapper class in ArrayList obj.

        System.out.println(list);  // {10, 20, 30, 10}


        //we have another form of add()method to specify the location of the adding element with index number.

        list.add(1, 90);
        // this will put 90 at index nb 1 location. and 20, will be shifted to the right

        System.out.println(list);  // {10, 90, 20, 30, 10}

        System.out.println("---------------------------------------------------------------------------------");

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Mohammad");
        studentList.add("Abdurasul");
        studentList.add("Abidullah");
        studentList.add("Tatiana");

        System.out.println(studentList.size()); //size()method
        System.out.println(studentList);

        String firstStudent = studentList.get(0);
        System.out.println(firstStudent);

        String lastStudent = studentList.get(studentList.size()-1);
        System.out.println(lastStudent);
    }
}
