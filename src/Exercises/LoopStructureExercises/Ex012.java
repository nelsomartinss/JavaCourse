package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex012 {
    void main(){
        int n, fac = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fac*=i;
        }

        System.out.printf("\n!%d: %d\n", n, fac);
        sc.close();
    }
}
