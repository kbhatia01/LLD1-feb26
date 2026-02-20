package Semap;

import java.util.concurrent.Semaphore;

public class ZeroOddEven {
    int count;
    Semaphore zeros1 = new Semaphore(1);
    Semaphore odd = new Semaphore(0);
    Semaphore even = new Semaphore(0);

    ZeroOddEven(int n){
        count = n;
    }

    public void printzero() throws InterruptedException {
        for (int i = 0; i < count; i++) {
            zeros1.acquire();
            System.out.print(0 +" ");
            if(i%2==1){
                even.release();
            } else {
                odd.release();
            }
        }
    }

    public void printEven() throws InterruptedException {
        for (int i = 2; i < count; i+=2) {
            even.acquire();
            System.out.print(i+" ");
            zeros1.release();
        }
    }

    public void printOdd() throws InterruptedException {
        for (int i = 1; i < count; i+=2) {
            odd.acquire();
            System.out.print(i+" ");
            zeros1.release();
        }
    }

}
