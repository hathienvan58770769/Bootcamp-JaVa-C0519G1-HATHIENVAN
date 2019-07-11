package ThucHanh;

import java.util.Scanner;

public class th10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month =  1;
        double interset_rate = 1.0;
        double total_interset = 0;

        System.out.println(" Enter investment a mount :");
        money = scanner.nextDouble();

        System.out.println(" Enter number of month :");
        month = scanner.nextInt();

        System.out.println(" Enter annual interest rate in percentage : ");
        interset_rate = scanner.nextDouble();

        for (int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset : " + total_interset);
    }
}
