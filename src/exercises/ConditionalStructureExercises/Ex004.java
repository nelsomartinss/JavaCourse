package Exercises.ConditionalStructureExercises;

import java.util.Scanner;

public class Ex004 {
    void main(){
        int startTime, endTime, totalTime = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter start time: ");
        startTime = sc.nextInt();
        System.out.print("Enter end time: ");
        endTime = sc.nextInt();

        if(startTime > 24 || endTime > 24){
            System.out.println("Invalid input");
        } else {
            if (endTime > startTime) {
                totalTime = endTime - startTime;
            } else {
                totalTime = (24 - startTime) + endTime;
            }
        }

        System.out.printf("\nThe game lasted %d hour(s)\n", totalTime);
        sc.close();
    }
}
