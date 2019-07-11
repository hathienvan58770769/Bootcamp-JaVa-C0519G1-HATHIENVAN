package ThucHanh;

import java.util.Scanner;

public class th11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight, height, bmi;

        System.out.println("Enter your weight (kg) : ");
        weight = scanner.nextDouble();

        System.out.println(" Enter your height (m) : ");
        height = scanner.nextDouble();

        bmi = weight/(height*height);

        if (bmi < 18.0){
            System.out.println(bmi + " --> Underweight");
        }else if (bmi < 25.0){
            System.out.println(bmi + " --> Normal");
        }else if (bmi < 30.0){
            System.out.println(bmi + " --> Overweight");
        }else {
            System.out.println(bmi + " --> Obese");
        }
    }
}
