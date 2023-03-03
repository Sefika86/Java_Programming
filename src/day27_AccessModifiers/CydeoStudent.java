package day27_AccessModifiers;


public class CydeoStudent {


    public String name;
    public int age;
    public char gender;


    public static String schoolName;
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        //schoolName = "CydeoSchool";
        //secretCode = "Wooden Spoon";
    }



    // that's not he best choice to initialize the static var. in a const. method
    // we do not want them to execute as the nb of objects. ONCE is enough
    //so the best choice is STATIC BLOCK:

    static{

        schoolName = "CydeoSchool";
        secretCode = "Wooden Spoon";

    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}


