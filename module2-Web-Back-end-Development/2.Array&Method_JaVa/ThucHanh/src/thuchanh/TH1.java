package thuchanh;

import java.util.Scanner;

public class TH1 {
    public static  double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return  fahrenheit;
    }
    public static  double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return  celsius;
    }
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
        System.out.println("Menu :");
        System.out.println("1. Fahrenheit to Celsius .");
        System.out.println("2. Celsius to Fahrenheit .");
        System.out.println("0. Exit .");
        System.out.println(" Enter your choice : ");
        choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Enter fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println(" Fahrenheit to celsius : " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println(" Enter celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println(" Celsius to fahrenheit : " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
