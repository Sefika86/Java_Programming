package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_containsAll {
    public static void main(String[] args) {


        ArrayList<String> employeesList = new ArrayList<>();

        employeesList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");

        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena", "Gadir") );

        boolean hasMuhtarAliKuzzat = employeesList.containsAll(Arrays.asList("Muhtar", "Ali", "Kuzzat"));

        System.out.println("hasAlena? " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);



    }
}
