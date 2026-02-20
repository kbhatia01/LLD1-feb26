package Semap;

public class ZeroThread implements Runnable{

    ZeroOddEven z;
    ZeroThread(ZeroOddEven obj){
        z=obj;
    }
    @Override
    public void run() {
        try {
            z.printzero();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
