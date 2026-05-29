package Exercises.ConditionalStructureExercises;

import java.util.Scanner;

public class Ex001 {
    void main(){
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        number = sc.nextInt();

        if(number < 0){
            System.out.println("NEGATIVE!");
        } else {
            System.out.println("NON-NEGATIVE!");
        }

        sc.close();
    }
}
