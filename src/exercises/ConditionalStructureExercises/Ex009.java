package Exercises.ConditionalStructureExercises;

import java.util.Scanner;

public class Ex009 {
    void main(){
        double firstSemesterGrade, secondSemesterGrade, finalGrade;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter First Semester Grade: ");
        firstSemesterGrade = sc.nextDouble();
        System.out.print("Enter Second Semester Grade: ");
        secondSemesterGrade = sc.nextDouble();

        finalGrade = firstSemesterGrade + secondSemesterGrade;
        System.out.printf("\nFinal grade %.1f\n", finalGrade);

        if (finalGrade < 60.00){
            System.out.println("Failed");
        }

        sc.close();
    }
}
