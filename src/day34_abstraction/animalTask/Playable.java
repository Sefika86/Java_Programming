package day34_abstraction.animalTask;

public interface Playable {


    boolean IsFriendly = true;    //static & final

    /*
    //how can we proof if this variable is static?
    //static only accepts static so try to call it in static void method?

    public static void main(String[] args) {
        System.out.println(IsFriendly);    //it can be called in a static method
    }

    // isFriendly = false;

    default void method1() {   //we can see this default class in a subclass as an instance method

    }

     */


    public abstract void play();     //abstract can be created only in an interface or in an abstract parent class



  //in interface;
    //static methods can be public or private
    //abstract method must be public only and without body (public & abstract keywords are optional)
    //default method can be public only



}
