package Exercises.ConditionalStructureExercises;

import java.util.Scanner;

public class Ex002 {
    void main(){
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        sc.close();
    }
}
