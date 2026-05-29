package Exercises.ConditionalStructureExercises;

import java.util.Scanner;

public class Ex007 {
    void main(){
        Scanner sc =  new Scanner(System.in);
        double x, y;

        System.out.print("\nEnter X: ");
        x = sc.nextDouble();
        System.out.print("Enter Y: ");
        y = sc.nextDouble();

        // origin
        if (x == 0 && y == 0){
           System.out.println("Origin");
           // in the middle
        } else if (x == 0.0){
            System.out.println("Y-Axis");
        } else if (y == 0.0){
            System.out.println("X-Axis");
            // right up
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
            // left up
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
            // left down
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
            // right down
        } else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
