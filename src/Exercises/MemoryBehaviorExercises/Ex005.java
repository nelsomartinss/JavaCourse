package Exercises.MemoryBehaviorExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfNumbers;
        double averageArray, sumArray = 0.0;

        System.out.print("\nHow many elements will the array have? : ");
        numberOfNumbers = sc.nextInt();
        double[] arrayNumbers = new double[numberOfNumbers];

        for(int i = 0; i < arrayNumbers.length; i++) {
            System.out.print("Enter the number: ");
            arrayNumbers[i] = sc.nextDouble();
            sumArray += arrayNumbers[i];
        }

        averageArray = sumArray / arrayNumbers.length;
        System.out.printf("\nThe average of the array: %.3f", averageArray);

        System.out.println("\nElements below the average:");
        for (double arrayNumber : arrayNumbers) {
            if (arrayNumber < averageArray) {
                System.out.println(arrayNumber);
            }
        }

        sc.close();
    }
}
