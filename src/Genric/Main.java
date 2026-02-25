package Genric;

public class Main {
    public static void main(String[] args) {
        Point<Integer, Integer> intPoint = new Point(23,44);
        Point<Float, Float> floatPoint = new Point(1.23,3.53);
        Point<String, Integer> siPoint = new Point<>("a", 10);
        intPoint.display();
        floatPoint.display();

    }
}