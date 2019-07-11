package baitap4;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println(triangle);

        triangle = new Triangle(4.5, 5.5, 3.0, "yellow", false);
        System.out.println(triangle);
    }
}
