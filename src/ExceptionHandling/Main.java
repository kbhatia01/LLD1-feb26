package ExceptionHandling;

public class Main {

    public static void main() throws NotToday {
//
//        try {
//            System.out.println(10/0);
//        } catch (ArithmeticException ae){
//            System.out.println("AE exception");
//
//            throw new ArithmeticException();
//
//        } catch (Exception e){
//            System.out.println("DOn't divide by 0");
//        } finally {
//            System.out.println("ajds");
//        }
//
//        System.out.println("bye");
//
//

        TestException te = new TestException();
        te.calculate(70);
        try{
            te.calculate(81);

        } catch (NotToday nt){

        }
    }
}
