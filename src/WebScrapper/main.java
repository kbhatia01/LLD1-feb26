package WebScrapper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(){
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i <10000; i++) {
            a.add("http://example.com/"+i);
        }
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i <10000 ; i++) {
//            es.submit(...)

        }
    }
}
