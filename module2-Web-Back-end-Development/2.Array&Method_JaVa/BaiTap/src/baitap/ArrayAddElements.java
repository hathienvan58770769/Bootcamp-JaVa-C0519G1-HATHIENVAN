package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number need to add");
        int number = sc.nextInt();
        System.out.println("Enter index");
        int index = sc.nextInt();

        if (index <= 1 || index > array.length - 1) {
            System.out.println("Can not add");
        } else {
            array = Arrays.copyOf(array, array.length + 1);
            System.out.println("Before:" + Arrays.toString(array));
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = number;
            System.out.println("After:" + Arrays.toString(array));
        }
    }

}
