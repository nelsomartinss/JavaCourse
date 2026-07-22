package Exercises.MemoryBehaviorExercises;

import Exercises.MemoryBehaviorExercises.Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String studentName;
        double firstGrade, secondGrade, averageGrade;
        int numberOfNumbers;

        System.out.print("\nHow many students will be entered? : ");
        numberOfNumbers = sc.nextInt(); sc.nextLine();
        Student[] students = new Student[numberOfNumbers];

        for(int i = 0; i < students.length; i++){
            System.out.printf("Enter the name, first grade, and second grade of the %dst student:\n", i + 1);
            studentName = sc.next(); sc.nextLine();
            firstGrade = sc.nextDouble();
            secondGrade = sc.nextDouble();
            students[i] = new Student(studentName, firstGrade, secondGrade);
        }

        System.out.println("\nStudents who passed: ");
        for (Student student : students) {
            averageGrade = student.getFirstGrade() + student.getSecondGrade() / 2;
            if (averageGrade >= 6.0) {
                System.out.println(student.getName());
            }
        }

        sc.close();
    }
}
