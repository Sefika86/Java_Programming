package day27_AccessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car();    //car object


        Car.CarEngine obj2 = obj1.new CarEngine();   //CarEngine object


        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();   //static class allows us to access its members without creating an obj

        //we did not need an object to call the inner static class, we just call it by the outer class name.
    }
}
