package ExceptionHandling;

public class NotToday extends Exception{
    NotToday(String message){
        super(message);
    }
}
