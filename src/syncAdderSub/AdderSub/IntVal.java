package syncAdderSub.AdderSub;

public class IntVal {
    int x = 0;

    public synchronized void add(int val){
        x+=val;
    }
    public synchronized void sub(int val){
        x-=val;
    }
}
