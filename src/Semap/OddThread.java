package Semap;

public class OddThread implements Runnable {
    ZeroOddEven z;
    OddThread(ZeroOddEven obj){
        z=obj;
    }
    @Override
    public void run() {
        try {
            z.printOdd();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
