package day38_exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

    //start from the second method
    public static void main(String[] args) throws InterruptedException {

        method1();

        //gave compile again ,so we added exception in body signature with throws keyword
    }


    public static void pauseFor5Seconds() throws InterruptedException {

        Thread.sleep(5000);

    }

    //exception handled temporarily, which means everytime, i call this method in another method,
    // it'll still give me compile (checked exception)


    public static void method1() throws InterruptedException {

        System.out.println("Hello World");
        pauseFor5Seconds();  //gave compile again ,so we added exception in body signature with throws keyword
        System.out.println("Hello Cydeo");

    }

    //---------------------------------------------------------------------------------------


    public static void method2() throws InterruptedException, FileNotFoundException {
        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First Program ended");

        new FileInputStream(" ");

        Thread.sleep(5000);
    }
}
