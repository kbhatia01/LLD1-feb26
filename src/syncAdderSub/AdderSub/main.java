package syncAdderSub.AdderSub;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {
    public static void main(String[] arr) throws ExecutionException, InterruptedException {

        IntVal x = new IntVal();
        Lock l = new ReentrantLock();

        Adder a = new Adder(x, l);
        Subt s = new Subt(x, l);
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> fa = es.submit(a);
        Future<Void> fs = es.submit(s);
        fs.get();
        fa.get();

        System.out.println(x.x);


    }
}

