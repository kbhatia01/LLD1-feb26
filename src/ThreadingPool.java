public class ThreadingPool implements Runnable{
    public int num_to_print;

    ThreadingPool(int p){
        num_to_print = p;
    }

    void print_num() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + "- " + num_to_print);
    }

    @Override
    public void run() {
        try {
            print_num();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}