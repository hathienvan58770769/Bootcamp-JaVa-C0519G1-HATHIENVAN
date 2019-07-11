package baitap;

import java.util.Scanner;

public class ArrayReverseElements {
    public static void main(String[] args) {
        //b1
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Denied. Must be less");
            }
        }
        while (size > 20);

        //b2
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("New element " + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }

        // print list
        System.out.println("Array list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }

        // xd reverse method, use intermediary variable
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j]; // gan array[j] cho temp
            array[j] = array[size - 1 - j]; // gan gia tri array[size -1-j] cho array[j]
            array[size - 1 - j] = temp; // gio lai gan gia tri cua temp cho array[size - 1 -j]
        }

        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
