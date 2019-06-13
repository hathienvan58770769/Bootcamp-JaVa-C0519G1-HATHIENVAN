package Baitap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle ");
            System.out.println("2. Print square triangle (top-left)");
            System.out.println("3. Print square triangle (bottom-right)");
            System.out.println("4. Print weight triangle");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            System.out.println("enter height :");
            int h = scanner.nextInt();

            System.out.println("enter width :");
            int w = scanner.nextInt();

            int i, k;
            switch (choice) {
                case 1:
                    while (h > 0) {
                        for (i = 0; i < h; i++) {
                            System.out.print('*');
                        }
                        for (k = 0; k <= w; k++) {
                            System.out.print('*');
                        }
                        h--;
                        w++;
                        System.out.println("");
                    }
                    break;
                case 2:
                    while (h > 0) {
                        for (i = 0; i < h; i++) {
                            System.out.print('*');
                        }
                        for (k = 0; k <= w; k++) {
                            System.out.print(' ');
                        }
                        h--;
                        w++;
                        System.out.println("");
                    }
                    break;
                case 3:
                    while (h > 0) {
                        for (k = 1; k < w; k++) {
                            System.out.print(' ');
                        }
                        for (i = 1; i <= h; i++) {
                            System.out.print('*');
                        }
                            h--;
                            w++;
                            System.out.println("");
                        }
                        break;
                case 4:

                    }

            }
        }
    }


