package ThucHanh;

import java.util.Scanner;

public class th2 {

        public static void main(String[] args) {
            float width;
            float height;

            Scanner scanner = new Scanner(System.in);

            System.out.println("enter a width :");
            width = scanner.nextFloat();

            System.out.println("enter a height :");
            height = scanner.nextFloat();

            float area = width * height;

            System.out.println("area is: " + area);
        }
}
