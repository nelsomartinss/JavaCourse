package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex004 {
    void main(){
        Scanner sc = new Scanner(System.in);
        double x, y;

        while (true) {
            System.out.print("Enter x: ");
            x = sc.nextDouble();
            System.out.print("Enter y: ");
            y = sc.nextDouble();

            if (x == 0.0 || y == 0.0){
                break;
            }

            if (x > 0.0 && y > 0.0) {
                System.out.println("Q1\n");
            } else if (x < 0.0 && y > 0.0) {
                System.out.println("Q2\n");
            } else if (x < 0.0 && y < 0.0 ) {
                System.out.println("Q3\n");
            } else {
                System.out.println("Q4\n");
            }
        }

        sc.close();
    }
}
