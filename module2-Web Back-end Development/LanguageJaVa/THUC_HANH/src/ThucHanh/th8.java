package ThucHanh;

import java.util.Scanner;

public class th8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
    while (choice != 0){
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("111111");
                    System.out.println("11111");
                    System.out.println("1111");
                    System.out.println("111");
                    System.out.println("11");
                    System.out.println("1");
                    break;
            case 2:
                    System.out.println("Draw the square");
                    System.out.println("------");
                    System.out.println("------");
                    System.out.println("------");
                    System.out.println("------");
                    System.out.println("------");
                    System.out.println("------");
                    break;
            case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
            case 0:
                    System.exit(0);
                    break;
            default:
                    System.out.println("No choice ");
        }
    }
    }
}
