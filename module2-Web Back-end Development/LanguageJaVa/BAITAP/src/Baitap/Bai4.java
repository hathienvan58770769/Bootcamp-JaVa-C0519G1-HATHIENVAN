package Baitap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int numbers = scanner.nextInt();

        int count = 0, kt = 0, n;
        for (int number = 2; number < 100 ; number++ ){
            if (count < numbers){
                for (n=2; n < number; n++){
                    if (number % n == 0){
                        kt++;

                    }
                }
                if (kt == 0){
                    System.out.print(number + ", ");
                    count++;
                }
                kt = 0;
            }else {
                break;
            }
        }
    }
}
