package day24_dateAndTime;

import day17_CustomClass.Employee;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        //Question ; remove the words if they start with letter j

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Java", "Python", "C#", "Java", "Ruby", "JavaScript", "C++", "C") );

        names.removeIf( p -> p.startsWith("J") );  //p is predicate, same meaning with each

        System.out.println(names);

        System.out.println("-------------------------------------------------------------");
//Question: remove the employees who make more than $100000

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        employees.removeIf( p -> p.salary > 100000 );

        for (Employee each : employees) {
            System.out.println(each.name + " : "+each.salary);
        }


// we are not allowed to use remove() method in a loop until we cover the topic iterable. SO removeIf()
// method is great in these cases, because it iterates the collections implicitly


    }
}
