package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex011 {
    void main(){
        int number, n1, n2;
        double div;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        for(int i = 0; i < number; i++){
            System.out.print("Enter the first number: ");
            n1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            n2 = sc.nextInt();

            if (n2 == 0){
                System.out.println("\nDivision impossible\n");
            } else {
                div = (double) n1 / (double) n2;
                System.out.printf("\n%d / %d = %.1f\n\n", n1, n2, div);
            }
        }

        sc.close();
    }
}
