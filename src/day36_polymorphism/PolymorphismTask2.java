package day36_polymorphism;

import day33_abstraction.employeeTask.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PolymorphismTask2 {

    public static void main(String[] args) {


        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
                new Developer("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Driver("Bella", 32, 'F', "D12", "Truck Driver", 95000),
                new Developer("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
                new Developer("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", 115000),
                new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
                new Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
                new Teacher("Conor", 35, 'M', "B2", "Physics Teacher", 85000),
        };


        // 2.1 store all the developers & testers into the following List of employees

        ArrayList<Employee> scrumMembers = new ArrayList<>();

        for (Employee each : employees) {
            if (each instanceof Developer || each instanceof Tester) {
                scrumMembers.add(each);

            }
        }
        System.out.println(scrumMembers);

        System.out.println(".......................................................................................");

        //2.2 store all the testers into the following List of testers:

        ArrayList<Tester> testers = new ArrayList<>();
        for (Employee each : scrumMembers) {
            if(each instanceof Tester){
                testers.add((Tester) each);
            }
        }
        System.out.println(testers);


        System.out.println(".......................................................................................");

// 2.3 store all the developers into the following List of developers:

        ArrayList<Developer> developers = new ArrayList<>();

        for (Employee each : employees) {
            if (each instanceof Developer) {
                developers.add((Developer) each);
            }
        }
        System.out.println(developers);

        System.out.println(".......................................................................................");

//  2.4 which tester has the maximum salary?

        String maxSalaryTester = " ";
        double maxSalary = testers.get(0).getSalary();
        for (Tester each : testers) {
            if(each.getSalary() > maxSalary){
                maxSalary = each.getSalary();
            }

            if(each.getSalary() == maxSalary){
                maxSalaryTester = "The tester who has the maximum salary is: " +each.getName()+": $"+ maxSalary;
            }
        }
        System.out.println(maxSalaryTester);   //The tester who has the maximum salary is: Tatiana: $130000.0

 // 2.5 which developer has the maximum salary?


        String minSalaryDev = " ";
        double minDEV = developers.get(0).getSalary();

        for (Developer each : developers) {
            if(each.getSalary() < minDEV){
                minDEV = each.getSalary();
        }
            if(each.getSalary() == minDEV){
                minSalaryDev = "The developer who has the minimum salary is: " +each.getName()+": $"+ minDEV;
            }
        }
        System.out.println(minSalaryDev);  //The developer who has the minimum salary is: Lucy: $128000.0

    }
}
