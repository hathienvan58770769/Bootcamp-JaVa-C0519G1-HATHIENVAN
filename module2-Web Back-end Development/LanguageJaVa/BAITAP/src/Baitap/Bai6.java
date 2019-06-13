package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a USD :");
        double usd = scanner.nextDouble();

        double vnd = usd * 23000;
        System.out.println("Money VND : " + vnd);

        int[] a = {1, 9, 3, 2};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        System.out.println(a);
    }
}
