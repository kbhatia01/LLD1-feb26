package WebScrapper;

import java.util.concurrent.Callable;

public class Scrapper implements Callable<String> {
    String website;
    Scrapper(String url){
        website = url;
    }
    public String call(){
        return website +"contenet..";
    }
}
