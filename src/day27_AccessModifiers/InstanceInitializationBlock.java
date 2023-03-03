package day27_AccessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;


    /*

//this is instance block, but it gives same values to each obj so you do not bee parameter

    {
        name = "James";
        age = 20;
    }


     */

//constructor can give different values to each obj, you need parameter
    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        InstanceInitializationBlock obj1 = new  InstanceInitializationBlock("James", 33);
        InstanceInitializationBlock obj2 = new  InstanceInitializationBlock("Jessica", 36);

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }



}
