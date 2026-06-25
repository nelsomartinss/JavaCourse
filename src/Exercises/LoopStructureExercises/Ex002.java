package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex002 {
    void main(){
        int age;
        double totalAge = 0, accumulator = 0, averageAge = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter age: ");
            age = sc.nextInt();

            if (age > 0){
                totalAge += age;
                accumulator += 1;
                averageAge = totalAge / accumulator;
            } else break;
        }

        if (averageAge > 0){
            System.out.printf("\nAge average: %.2f\n", averageAge);
        } else {
            System.out.println("Impossible to calculate");
        }

        sc.close();
    }
}
