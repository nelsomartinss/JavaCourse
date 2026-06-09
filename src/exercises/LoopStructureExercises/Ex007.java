package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex007 {
    void main(){
        int x, y, max, min, sumOdd = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter X number: ");
        x = sc.nextInt();
        System.out.print("Enter Y number: ");
        y = sc.nextInt();

        if (x < y){
            min = x;
            max = y;
        } else {
           min = y;
           max = x;
        }

        // the min and max values are not included in the count
        for (int i = min+1; i < max; i++){
            if (i % 2 != 0){
                sumOdd += i;
            }
        }

        System.out.printf("\nThe sum of the odd numbers between %d and %d is: %d\n", x, y, sumOdd);
        sc.close();
    }
}
