package Semap;

public class EvenThread implements Runnable{
    ZeroOddEven z;
    EvenThread(ZeroOddEven obj){
        z=obj;
    }
    @Override
    public void run() {
        try {
            z.printEven();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
