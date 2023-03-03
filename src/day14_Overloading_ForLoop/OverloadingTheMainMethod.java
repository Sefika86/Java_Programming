package day14_Overloading_ForLoop;

public class OverloadingTheMainMethod {
    public static void main(String[] args) {  //this main method created by java so only this one is runable
        System.out.println("A");             // the others are created by myself, they are not in system library
    }


    public static void main(int[] args) {
        System.out.println(5);
    }


    public static void main(double[] args) {
        System.out.println("C");
    }

    public static void main(boolean[] args) {
        System.out.println("c");
    }



}
