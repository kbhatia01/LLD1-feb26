package AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subt implements Callable<Void> {
    IntVal iv;
    Lock ls;
    Subt(IntVal i, Lock l){
        iv = i;
        ls=l;
    }
    public Void call(){
        for (int i = 0; i < 10000 ; i++) {
            ls.lock();
            iv.x-=1;
            ls.unlock();
        }
        return null;
    }
}
