public class threading implements Runnable {
    public int num_to_print;

    threading(int p){
        num_to_print = p;
    }
//    void printVal(){
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//
//    }

    void print_num() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(num_to_print);
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
