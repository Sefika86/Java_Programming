package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {


    public String groupName;
    public int groupId;
    public ArrayList<Student> students =new ArrayList<>();



//we create our constructor method not including the arrayList because it causes us challenges when we create our objects later on
    //so do not include the arrayList
    // but you still need to instantiate it manually without this.keyword,
    // otherwise you can not add multiple students later on when create the objects.

    public StudentsGroup(String groupName, int groupId) { //I did not add the arrayList here in cons. because I'll add them later on with add methods
        this.groupName = groupName;
        this.groupId = groupId;
       // students = new ArrayList<>();  ==> you do not to instantiate here bc you already did at the top in instance variables
    }



//there are 3 ways to create student objects:



    //way 1.  by passing the student obj.
    public void addStudent(Student student){  //it takes one student obj and adds it to the arraylist of students
        students.add(student);
    }



    //way 2. by passing the attributes; name age gender id.
    public void addStudent(String name, int age, char gender, String id){
        students.add( new Student(name,age,gender,id) );
    } //takes name,age,gender,id of student info, creates student obj by using the given info, then add the student objects to the ArrayList




    //3. by passing the Array of students
    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }



    //remove function by the student id
    public void removeStudents(String id){
        students.removeIf(p-> p.id.equals(id));
    } //takes one argument ==>id and removes specific students from the ArrayList



    //toString method
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }

    //we created toString method ,but we added .size() method manually for being able to find the number of students
}


/*
Create a custom class named StudentsGroup
Attributes:
	groupName, groupId, students (ArrayList<Students>)

Add a constructor that can set the groupId and groupName
	initialize students arraylist in the constructor's body

Methods:
addStudent(Student): adds the specified student to the students arrayList
(we will create 3 overloaded addStudent methods)

removeStudent(by their id, because it is unique for every single student):
removes the student with the specified id from the students arraylist

toString(): displays the groupName, groupId and total number of students
when a group object is passed in the print statement
 */