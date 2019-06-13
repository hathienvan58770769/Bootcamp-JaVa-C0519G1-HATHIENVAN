package thuchanh;

import java.util.Scanner;

public class Test_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the width :");
        double width = scanner.nextDouble();
        System.out.println("enter the height :");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle.display());
        System.out.println("Perimeter : " + rectangle.getPerimeter());
        System.out.println("Area : " + rectangle.getArea() + " m2");
    }
}
