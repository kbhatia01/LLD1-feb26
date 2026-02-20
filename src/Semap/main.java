package Semap;

import java.util.concurrent.ExecutionException;

public class main {
    public static void main(String[] arr) throws ExecutionException, InterruptedException {
        int n=5;
        ZeroOddEven zn = new ZeroOddEven(n);
        Thread t1 = new Thread(new ZeroThread(zn));
        Thread t2 = new Thread(new OddThread(zn));
        Thread t3 = new Thread(new EvenThread(zn));


        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
