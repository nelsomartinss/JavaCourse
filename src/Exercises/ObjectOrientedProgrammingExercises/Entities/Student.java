package Exercises.ObjectOrientedProgrammingExercises.Entities;

public class Student {
    public String name;
    public double gradeOne, gradeTwo, gradeThree;

    public double finalGrade(){
        double sumGrade = gradeOne + gradeTwo + gradeThree;
        double finalGrade = 0;

        if (sumGrade > 100){
            System.out.print("\nYou cannot score more than 100 points in total. Please try again!\n");
        } else {
            finalGrade = sumGrade;
        }

        return finalGrade;
    }

    public void isPass(double finalGrade){
        double missingPoints = 0;

        if (finalGrade < 60){
            missingPoints = 60 - finalGrade;
            System.out.printf("\nFinal grade: %.2f\n", finalGrade);
            System.out.print("FAILED\n");
            System.out.printf("Missing %.2f points\n", missingPoints);
        } else {
            System.out.printf("\nFinal grade: %.2f\n", finalGrade);
            System.out.print("PASS\n");

        }
    }
}
