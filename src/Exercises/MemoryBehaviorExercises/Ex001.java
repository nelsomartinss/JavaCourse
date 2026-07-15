package Exercises.MemoryBehaviorExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of numbers you want to add: ");
        int[] arrayNumbers = new int[sc.nextInt()];

        if(arrayNumbers.length <= 10) {
            for(int i = 0; i < arrayNumbers.length; i++) {
                System.out.print("Enter the number: ");
                arrayNumbers[i] = sc.nextInt();
            }
        } else {
            System.out.print("At most 10.");
        }

        System.out.println("\nNegative numbers:");

        for (int arrayNumber : arrayNumbers) {
            if (arrayNumber < 0) {
                System.out.printf("%d\n", arrayNumber);
            }
        }

        sc.close();
    }
}
