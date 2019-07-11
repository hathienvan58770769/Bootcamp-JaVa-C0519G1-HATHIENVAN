package thuchanh;

import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size : " );
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20 ");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element  " + ( i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(" Property list : ");
        for (int j = 0; j <array.length; j++){
            System.out.println(array[j] );
        }
        int max = array[0];
        int indext = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                indext = j + 1;
            }
        }
        System.out.println("the largest property value in the list is  " + max + " , at position " + indext);
    }

}
