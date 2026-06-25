package Lessons.ConditionalStructure;

import java.util.Scanner;

public class ConditionalStructure {
    void main(){
        int hour;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the hour: ");
        hour = sc.nextInt();

        // Simple
        if (hour >= 0 && hour <= 12){
            System.out.println("Good morning!");
            // ----------------------
        // Chained structures
        } else if (hour >= 12 && hour <= 18){
            System.out.println("Good afternoon!");
        // ----------------
        } else  if (hour >= 18 && hour <= 24){
            System.out.println("Good evening!");
        // Compound
        } else {
            System.out.println("Sorry out of range!");
        } // ------------

        sc.close();
    }
}
