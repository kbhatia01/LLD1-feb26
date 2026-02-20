package AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Callable<Void> {
    IntVal iv;
    Lock l;
    Adder(IntVal i, Lock lc){
        iv = i;
        l = lc;
    }
    public Void call(){

        for (int i = 0; i < 10000 ; i++) {
            try {
                l.lock();
                iv.x += 1;
            } finally {
                l.unlock();

            }

        }
        return null;
    }
}
