package AdderSubAtomic.AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

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
//                l.lock();
                iv.x.incrementAndGet();
            } finally {
//                l.unlock();

            }

        }
        return null;
    }
}
