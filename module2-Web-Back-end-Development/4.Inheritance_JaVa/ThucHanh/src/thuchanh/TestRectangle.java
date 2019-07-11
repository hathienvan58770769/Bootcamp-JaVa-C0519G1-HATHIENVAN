package thuchanh;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        //
        rectangle = new Rectangle(4.5, 6.2);
        System.out.println(rectangle);
        //
        rectangle = new Rectangle(3.5 , 4.7, "pink", false);
        System.out.println(rectangle);
    }
}
