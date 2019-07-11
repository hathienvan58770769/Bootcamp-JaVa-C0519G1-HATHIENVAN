package thuchanh;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.5);
        System.out.println(square);

        square = new Square(4.2, "pink", true);
        System.out.println(square);
    }
}
