package day43_Generics_Enums;

public class Generics<T> {

    public void printEach(T[] t){

        for (T each : t) {
            System.out.println(each);

        }
    }

}
class Test{
    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50, 60};

        Generics<Integer> obj1 = new Generics<>();
        obj1.printEach(numbers);




    }
}