package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex010 {
    void main(){
        int number;
        double v1, v2, v3, weightedAverage;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        for (int i = 0; i < number; i++){
            System.out.print("Enter the first value: ");
            v1 = sc.nextDouble();
            System.out.print("Enter the second value: ");
            v2 = sc.nextDouble();
            System.out.print("Enter the third value: ");
            v3 = sc.nextDouble();

            weightedAverage = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) /  10;
            System.out.printf("The average value is %.1f\n\n", weightedAverage);
        }

        sc.close();
    }
}
