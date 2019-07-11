package baitap;

import java.util.Scanner;

public class ArrayGreatest {
    public static void main(String[] args) {
        //khai bao bien, nhap kich thuoc mang
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println(" Size should be less");
            }
        } while (size > 20);

        //tao mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        // print list
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        // duyet phan tu trong mang de tim max va vi tri
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " , at position " + index);

    }
}
