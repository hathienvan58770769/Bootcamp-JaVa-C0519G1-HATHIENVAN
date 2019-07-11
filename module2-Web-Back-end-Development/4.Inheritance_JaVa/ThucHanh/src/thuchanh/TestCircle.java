package thuchanh;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle =  new Circle();
        System.out.println(circle);
        //
        circle = new Circle(3.5);
        System.out.println(circle);
        //
        circle = new Circle(4.5, "yellow", false);
        System.out.println(circle);
    }
}
