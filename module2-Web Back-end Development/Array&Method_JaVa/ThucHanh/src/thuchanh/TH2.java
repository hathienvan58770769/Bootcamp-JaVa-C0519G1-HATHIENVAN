package thuchanh;

import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila",
                "Sienna", "Tanya", "Connor", "Zachariah",
                "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a name's student :");
        String name_student = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(name_student)){
                System.out.println("Position of the students in the list " + name_student
                        + " is : " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found " + name_student + " in the list.");
        }
    }
}
