package day32_finalKeyword.personTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public final class Student extends Person {

    private String schoolName;
    private char grade;
    private final LocalDate dateOfGraduation;
    private final LocalDate firstDayOfSchool;


    public Student(String name, char gender, LocalDate dateOfBirth, String schoolName, char grade, LocalDate dateOfGraduation, LocalDate firstDayOfSchool) {
        super(name, gender, dateOfBirth);
        setSchoolName(schoolName);
        setGrade(grade);

        if(dateOfGraduation.isBefore(firstDayOfSchool)){
            System.err.println("Invalid date of graduation: " + dateOfGraduation);
            System.exit(1);
        }
        this.dateOfGraduation= dateOfGraduation;

        if (firstDayOfSchool.isAfter(dateOfGraduation)){
            System.err.println("Invalid date of first day of school: " + firstDayOfSchool);
            System.exit(1);
        }
        this.firstDayOfSchool = firstDayOfSchool;

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        ArrayList<Character> grades = new ArrayList<>();
        grades.addAll(Arrays.asList('A', 'B', 'C', 'D', 'F'));

        if(! grades.contains(grade)){
            System.err.println("Invalid grade: "+ grade);
        }
        this.grade = grade;
    }

    public LocalDate getDateOfGraduation() {
        return dateOfGraduation;
    }

    public LocalDate getDateOfFirstDayOfSchool() {
        return firstDayOfSchool;
    }


    public void study(){
        System.out.println(getName()+ " is studying in " + schoolName);
    }


    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping less than usual to finish her recorded videos:(((((");
    }


    @Override
    public String toString() {
        return super.toString() +
                ", schoolName='" + schoolName + '\'' +
                ", grade='" + grade + '\'' +
                ", dateOfGraduation='" + dateOfGraduation + '\'' +
                ", firstDayOfSchool='" + firstDayOfSchool;

    }






}
