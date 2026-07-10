package Lessons.MemoryBehavior;

import java.util.Locale;
import java.util.Scanner;

public class Arrays {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfPeople;
        double sum = 0.0, media;

        System.out.print("Enter number of people: ");
        numberOfPeople = sc.nextInt();
        double[] heights = new double[numberOfPeople];

        for(int i = 0; i < numberOfPeople; i++){
            System.out.printf("Enter the height of the %dº person: ", i + 1);
            heights[i] = sc.nextDouble();
        }

        for(int i = 0; i < numberOfPeople; i++){
            sum += heights[i];
        }

        media =  sum / numberOfPeople;
        System.out.printf("Average height: %.2f\n", media);

        sc.close();
    }
}
