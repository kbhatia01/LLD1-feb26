package Genric;

    public class Point <T, V>{
        T x;
        V y;
        public Point(T x , V y)
        {
            this.x = x;
            this.y = y;
        }
        public void display()
        {
            System.out.println(x);
            System.out.println(y);
        }


}
