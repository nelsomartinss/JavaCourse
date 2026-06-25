package Exercises.ConditionalStructureExercises;

import java.util.Scanner;

public class Ex010 {
    void main(){
        double a, b, c, delta, r1, r2;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter A: ");
        a = sc.nextDouble();
        System.out.print("Enter B: ");
        b = sc.nextDouble();
        System.out.print("Enter C: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4.0 * a * c;

        if (a == 0.0 || delta < 0.0){
            System.out.println("\nImpossible to calculate");
        } else {
            r1 = (-b + Math.sqrt(delta)) / (2.0 * a); // +
            r2 = (-b - Math.sqrt(delta)) / (2.0 * a); // -
            System.out.printf("\nR1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }

        sc.close();
    }
}
