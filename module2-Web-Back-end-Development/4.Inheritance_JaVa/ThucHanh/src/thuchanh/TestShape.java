package thuchanh;

public class TestShape {
    public static void main(String[] args) {
        Shape shape =  new Shape();
        System.out.println(shape);
        //thay doi
        shape = new Shape("red", false);
        System.out.println(shape);

    }
}
