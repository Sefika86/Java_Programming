package day27_AccessModifiers;

public class InstanceBlock {


    public InstanceBlock(){   //constructor method
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();

    }


    {
        System.out.println("instance block");
    }
}
