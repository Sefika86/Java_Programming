package day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread {

    //this is our custom thread class

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello World " +i + " from Thread " +threadNumber);
            try {
                Thread.sleep(500);   //will give 200 milliseconds between each loop execution
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
