package Exercises.SequentialStructureExercises;

import java.util.Scanner;

public class Ex005 {
    void main(){
        int A, B, C, D, difference;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        A = sc.nextInt();
        System.out.print("Enter the value of B: ");
        B = sc.nextInt();
        System.out.print("Enter the value of C: ");
        C = sc.nextInt();
        System.out.print("Enter the value of D: ");
        D = sc.nextInt();

        difference = (A * B) - (C * D);

        System.out.printf("\nDIFFERENCE = %d\n", difference);
    }
}
