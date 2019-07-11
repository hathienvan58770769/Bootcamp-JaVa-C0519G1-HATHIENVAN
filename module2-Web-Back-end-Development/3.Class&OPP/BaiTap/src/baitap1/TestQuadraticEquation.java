package baitap1;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a :");
        double a = scanner.nextDouble();

        System.out.println("Enter b :");
        double b = scanner.nextDouble();

        System.out.println("Enter c :");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println(quadraticEquation.display());
    }
}
