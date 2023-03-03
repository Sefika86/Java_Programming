package day32_finalKeyword.personTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {

    private String programmingLanguage;


    public Developer(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth, jobTitle, salary);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        ArrayList<String> languages = new ArrayList<>();
        languages.addAll(Arrays.asList("Java", "Python", "Java Script", "C#", "C++"));
        if(! languages.contains(programmingLanguage)){
            System.err.println("Invalid programming language: " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding.");
    }

    @Override
    public String toString() {
        return super.toString()+
                "programmingLanguage='" + programmingLanguage;
    }
}
