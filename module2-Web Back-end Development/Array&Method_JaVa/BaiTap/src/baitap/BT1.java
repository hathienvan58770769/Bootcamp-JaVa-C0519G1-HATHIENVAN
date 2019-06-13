package baitap;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        arr = new int[size];
        int i = 0 ;
        while ( i < arr.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println("Enter number X: ");
        int numberX = scanner.nextInt();
        System.out.println("Enter X position indext is : ");
        int indext = scanner.nextInt();

        for (i = 0; i <= arr.length; i--) {
            if (indext<=1 && indext >= arr.length-1){
                System.out.println("Cannot insert element into array !!!");
            }else {
                arr[indext] = numberX;
                System.out.print(arr);
            }
        }
    }
}
