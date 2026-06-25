package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex006 {
    void main(){
        int number, calc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            calc = number * i;
            System.out.printf("%d * %d = %d\n", number, i, calc);
        }

        sc.close();
    }
}
