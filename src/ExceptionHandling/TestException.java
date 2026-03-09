package ExceptionHandling;

public class TestException {

    void calculate(int age) throws NotToday {
        if (age>80){
            throw new NotToday("I am not available today");
        }
        System.out.println(age);

    }
}
