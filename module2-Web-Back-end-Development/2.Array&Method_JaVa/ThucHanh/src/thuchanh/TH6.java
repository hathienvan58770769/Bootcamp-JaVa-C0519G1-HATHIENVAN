package thuchanh;

import java.util.Scanner;

public class TH6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] arr;

        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        arr = new int[size];
        int i = 0;

        while (i < arr.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print("\t" +arr[j]);
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }

}
