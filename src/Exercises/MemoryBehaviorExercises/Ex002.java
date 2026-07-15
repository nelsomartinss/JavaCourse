package Exercises.MemoryBehaviorExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfNumbers;
        double sum = 0.0, media;

        System.out.print("\nEnter the number of numbers you want to add: ");
        numberOfNumbers = sc.nextInt();
        double[] arrayNumbers = new double[numberOfNumbers];

        for(int i = 0; i < numberOfNumbers; i++){
            System.out.print("Enter number: ");
            arrayNumbers[i] = sc.nextDouble();
            sum += arrayNumbers[i];
        }

        System.out.print("\nValues: ");
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.printf("%.1f ", arrayNumbers[i]);
        }

        System.out.printf("\nSum: %.2f", sum);

        media = sum / arrayNumbers.length;

        System.out.printf("\nAverage: %.2f\n", media);

        sc.close();
    }
}
