package Exercises.MemoryBehaviorExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfValues;

        System.out.print("\nHow many values will each array have?: ");
        numberOfValues = sc.nextInt();
        int[] arrayA =  new int[numberOfValues];
        int[] arrayB =  new int[numberOfValues];

        System.out.println("\nEnter the values of array A: ");
        for(int i = 0; i < arrayA.length; i++){
            arrayA[i] = sc.nextInt();
        }

        System.out.println("\nEnter the values of array B: ");
        for(int i = 0; i < arrayB.length; i++){
            arrayB[i] = sc.nextInt();
        }

        int[] arrayC = new int[numberOfValues];

        for(int i = 0; i < arrayC.length; i++){
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        System.out.println("\nThe sum of the elements of the array A and B are: ");
        for (int j : arrayC) {
            System.out.println(j);
        }

        sc.close();
    }
}
