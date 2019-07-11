package ThucHanh;

import java.util.Scanner;

public class th3 {
    public static void main(String[] args) {

        System.out.println("linear Equation Resolver");
        System.out.println("Given a equation as 'a*x + b = c '");

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("a : ");
        a = scanner.nextDouble();

        System.out.println("b : ");
        b = scanner.nextDouble();

        System.out.println("c : ");
        c = scanner.nextDouble();

        if (a != 0){
            double solution = -b/a;
            System.out.println("the solution is: " + solution);
        }else {
            if (b == 0){
                System.out.println("the solution is all x!");
            }else {
                System.out.println("no solution");
            }
        }
    }
}
