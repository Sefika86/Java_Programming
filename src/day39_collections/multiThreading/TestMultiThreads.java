package day39_collections.multiThreading;

import com.sun.jdi.VoidValue;

public class TestMultiThreads {

    public static void main(String[] args) {

        //this is just an instance of java application, which is called process


        ThreadHelloWorld thread1 =new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 =new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 =new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 =new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 =new ThreadHelloWorld(5);

/*
        thread1.run(); //start method will start the run method we override in custom class
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();

 */


        thread1.start(); //start method will start the run method we override in custom class
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
