package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person {  //if only student class inherited person class ==> single inheritance

//some additional variables and methods (study) that bot common for all person but for students.
    private char grade;
    private String studentID;


//subclass called super classes constructor with super keyword,
// but then we created getter and setters for those extra variables which only common to all students
// and add them in constructor manually(with set method)

//                                                           we add these 2 parameters manually
    public Student(String name, char gender, LocalDate DOB, char grade, String studentID) {
        super(name, gender, DOB);
        setGrade(gender);
        setStudentID(studentID);

    }


    public char getGrade() {
        return grade;
    }


    public void setGrade(char grade) {
        this.grade = grade;
    }


    public String getStudentID() {
        return studentID;
    }


    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    public void study(){
        System.out.println(getName() + " is studying");

    }
}
