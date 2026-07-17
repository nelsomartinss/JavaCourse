package Exercises.MemoryBehaviorExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int sumEven = 0, evenCounter = 0;
        double averageEvens;

        System.out.print("\nHow many elements will the array have? : ");
        int[] arrayNumbers = new int[sc.nextInt()];

        for(int i = 0; i < arrayNumbers.length; i++) {
            System.out.print("Enter the number: ");
            arrayNumbers[i] = sc.nextInt();
        }

        for (int arrayNumber : arrayNumbers) {
            if (arrayNumber % 2 == 0) {
                sumEven += arrayNumber;
                evenCounter++;
            }
        }

        if(sumEven == 0.0){
            System.out.println("\nNo even numbers!");
        } else {
            averageEvens = (double) sumEven / evenCounter;
            System.out.printf("\nAverage of the even numbers: %.1f\n", averageEvens);
        }

        sc.close();
    }
}
