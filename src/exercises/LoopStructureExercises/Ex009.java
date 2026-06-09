package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex009 {
    void main(){
        int number, x, numbersIn = 0, numbersOut = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number: ");
        number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.print("Enter X number: ");
            x = sc.nextInt();

            if (x >= 10 && x <= 20){
                numbersIn+=1;
            } else {
                numbersOut+=1;
            }
        }

        System.out.printf("\n%d in\n%d out\n",  numbersIn, numbersOut);
        sc.close();
    }
}
