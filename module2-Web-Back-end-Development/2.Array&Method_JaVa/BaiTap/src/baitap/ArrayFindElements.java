package baitap;

import java.util.Scanner;

public class ArrayFindElements {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter whatever");
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Exist at index " + i);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Not exist in array");
        }
    }
}
