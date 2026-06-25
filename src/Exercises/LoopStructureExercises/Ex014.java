package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex014 {
    void main(){
        int n, first, second, third;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            first = i;
            second = i * i;
            third = i * i * i;
            System.out.printf("%d %d %d\n", first, second, third);
        }

        sc.close();
    }
}
