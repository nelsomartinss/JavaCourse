package Exercises.ConditionalStructureExercises;

import java.util.Scanner;

public class Ex006 {
    void main(){
        double number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = sc.nextDouble();

        if (number >= 0 && number <= 25){
            System.out.println("Range [0,25]");
        } else if (number >= 25 && number <= 50){
            System.out.println("Range [25, 50]");
        } else if (number >= 50 && number <= 75){
            System.out.println("Range [50, 75]");
        } else if (number >= 75 && number <= 100){
            System.out.println("Range [75, 100]");
        } else {
            System.out.println("Out of range");
        }

        sc.close();
    }
}
