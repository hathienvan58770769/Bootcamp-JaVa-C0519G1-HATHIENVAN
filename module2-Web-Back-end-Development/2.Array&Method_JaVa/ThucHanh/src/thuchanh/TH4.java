package thuchanh;

import java.util.Scanner;

public class TH4 {
    /*public static void main(String[] args) {

                int[] arr = {4, 12, 7, 8, -1, 6, 9};
                int index = minValue(arr);
                System.out.println("The smallest element in the array is: " + arr[index]);
            }

            public static int minValue(int[] array) {

                int min = array[0];
                int index = 0;

                for (int i = 1; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                        index = i;
                    }
                }

                return index;
            }
*/
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
        int min = array[0];
        int indext = 1;
        for (int j = 0; j <array.length; j++){
            if (array[j] < min){
                min = array[j];
                indext = j + 1;
            }
        }
        System.out.println("the largest property value in the list is  " + min + " , at position " + indext);
    }

}


