package Exercises.ObjectOrientedProgrammingExercises;

import Exercises.ObjectOrientedProgrammingExercises.Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    void main(){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        double finalGrade;

        System.out.print("\nName: ");
        student.name = sc.nextLine();
        System.out.println("Enter your three grades: ");
        student.gradeOne = sc.nextDouble();
        student.gradeTwo = sc.nextDouble();
        student.gradeThree = sc.nextDouble();

        finalGrade = student.finalGrade();
        student.isPass(finalGrade);

        sc.close();
    }
}
