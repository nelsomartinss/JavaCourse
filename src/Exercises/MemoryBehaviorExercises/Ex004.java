package Exercises.MemoryBehaviorExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double largestValue;
        int numberOfNumbers, positionLargestValue = 0;

        System.out.print("\nHow many numbers will you enter? : ");
        numberOfNumbers = sc.nextInt();
        double[] arrayNumbers = new double[numberOfNumbers];

        largestValue = arrayNumbers[0];

        for(int i = 0; i < arrayNumbers.length; i++) {
            System.out.print("Enter the number: ");
            arrayNumbers[i] = sc.nextDouble();
        }

        for(int i = 0; i < arrayNumbers.length; i++){
            if(arrayNumbers[i] > largestValue){
                largestValue = arrayNumbers[i];
                positionLargestValue = i;
            }
        }

        System.out.println("\nLargest number: " + largestValue);
        System.out.println("Position of the largest value: " + positionLargestValue);

        sc.close();
    }
}
