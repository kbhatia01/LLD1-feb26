package syncAdderSub.AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    IntVal iv;
    final Lock l;
    Adder(IntVal i, Lock lc){
        iv = i;
        l = lc;
    }
    public Void call(){

        for (int i = 0; i < 10000 ; i++) {
            try {
//                synchronized (l){
//                    iv.x+=1;
//                }
//                l.lock();
                iv.add(1);
            } finally {
//                l.unlock();

            }

        }
        return null;
    }
}


//Implement a BankAccount class with a balance.
//Create multiple threads representing depositors and withdrawers.
//Simulate a race condition where multiple users deposit and withdraw simultaneously.
//Fix the issue using:
//synchronized methods
//synchronized blocks
//Measure execution time with and without synchronization.