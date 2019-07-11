package ThucHanh;

import java.util.Scanner;

public class th9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a number a : ");
        a = scanner.nextInt();
        System.out.println("Enter a number b : ");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0){
            System.out.println("No greatset common factor ");
            }
        while (a != b){
            if (a > b){
                a -= b;
            }else {
                b -= a;
            }
        }
        System.out.println("Greatest common factor : " + a);
    }
}
