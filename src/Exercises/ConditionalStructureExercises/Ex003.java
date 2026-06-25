package Exercises.ConditionalStructureExercises;

import java.util.Scanner;

public class Ex003 {
    void main(){
        int A, B;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter first number: ");
        A = sc.nextInt();
        System.out.print("Enter second number: ");
        B = sc.nextInt();

        // The operator % depends on the order of factors
        if (A % B == 0 || B % A == 0){
            System.out.println("ARE MULTIPLES");
        } else {
            System.out.println("ARE NOT MULTIPLES");
        }

        sc.close();
    }
}
