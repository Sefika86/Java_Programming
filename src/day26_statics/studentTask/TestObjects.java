package day26_statics.studentTask;

import java.util.Arrays;

public class TestObjects {

    public static void main(String[] args) {


        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student2, student3, student4, student5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);

        //we can add students in group 1 with any overloaded addStudent method that we created in studentsGroup class

        group1.addStudent(student1);  //yusuf  //way1

        group1.addStudent("Khashayar", 34, 'M', "F35");   //way2

        group1.addStudent(students);   //way3     glenio, sumeyye,  mehmet, sebastian

        System.out.println(group1);   // 6 students in total


        System.out.println("----------------------------------------");


        group1.removeStudents("D43");
        group1.removeStudents("E27");


        System.out.println(group1);  //4 students remaining

        System.out.println("----------------------------------------------------------------");
//for ex: you can take these 4 student names and ids by iterating the ArrayList with the for each loop.

        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);
        }

        System.out.println("----------------------------------------------------");

//you can create students group objects as many as you want

        StudentsGroup group2 = new StudentsGroup("Java Tigers", 2);

        StudentsGroup group3 = new StudentsGroup("Java lions", 3);

        StudentsGroup group4 = new StudentsGroup("Java Horses", 4);

        StudentsGroup[] groups = {group1 , group2 , group3 , group4};



    }
}

/*
3. Create a class named TestPersonObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list


 */