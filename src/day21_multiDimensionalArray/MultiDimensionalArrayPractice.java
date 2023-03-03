package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Nebi", "Sefika", "Melike", "Ipek", "MehmetNaci"};
        String[] group2 = {"Nazim", "Aysenur", "Erdem"};
        String[] group3 = {"Mehmet", "Saffet"};
        String[] group4 = {"Naci", "Fadime"};

        String[][] groups ={ group1, group2, group3, group4};
//                              0       1      2        3
        System.out.println(groups.length);

        System.out.println("------------------------------------------------");
//each element in these 1D arrays with nested for loop
        for (int i = 0; i < groups.length; i++) { //i is each single dimensional array
            System.out.println(Arrays.toString(groups[i]));
            for (int j = 0; j < groups[i].length; j++) {
                System.out.println(groups[i][j]);
            }
        }

        System.out.println("------------------------------------------------");

//each element with for each loop

        for (String[] each1D : groups) {
            System.out.println(Arrays.toString(each1D));
            for (String eachElement : each1D) {
                System.out.println(eachElement);
            }
        }

        System.out.println("------------------------------------------------");
//reverse each element with NESTED FOR LOOP: this reverse both arrays and elements in them

        for (int i = groups.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(groups[i]));
            for (int j = groups[i].length - 1; j >= 0; j--) {
                System.out.println(groups[i][j]);
            }
        }

        System.out.println("------------------------------------------------");
//reverse with a FOR LOOP and a FOR EACH LOOP: this reverse arrays only but do not reverse the elements in them
        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachPerson : eachGroup) {
                System.out.println(eachPerson);
            }
        }
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println(Arrays.toString(groups));  //toString method is single dimensional only
        System.out.println(Arrays.deepToString(groups));   //deepToString for printing Multi-dimensional arrays

    }
}
