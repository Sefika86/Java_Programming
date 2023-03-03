package day27_AccessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {
    /*
    which one executes first?
    1.static block
    2.main method
    *instance block and constructor belong to object so without creating an onj they do not execute
    *after we create the objects
    3. instance block executes (as number of objects)
    4. last constructor executes   "        "

     */

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("constructor");
    }



    {
        System.out.println("instance block");
    }



    static {
        System.out.println("Static block");
    }



    public static void main(String[] args) {
        System.out.println("main method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();

        new StaticBlock_vs_InstanceBlock_vs_Constructor();

        new StaticBlock_vs_InstanceBlock_vs_Constructor();

    }

}
