import java.util.concurrent.Callable;

public class ThreadingPool implements Callable<Integer> {
    public int num_to_print;

    ThreadingPool(int p){
        num_to_print = p;
    }

    void print_num() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(Thread.currentThread().getName() + "- " + num_to_print);
    }

    @Override
    public Integer call() throws InterruptedException {
        Thread.sleep(1000);

        return num_to_print;
    }

}