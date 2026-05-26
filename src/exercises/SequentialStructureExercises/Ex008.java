package Exercises.SequentialStructureExercises;

import java.util.Scanner;

public class Ex008 {
    void main(){
        double A, B, C,Triangle, Circle, Trapezoid, Square, Rectangle;
        double pi =  3.14159;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the first number: ");
        A = sc.nextDouble();
        System.out.print("Enter the second number: ");
        B = sc.nextDouble();
        System.out.print("Enter the third number: ");
        C = sc.nextDouble();

        Triangle = A * C / 2.0;
        Circle = pi * Math.pow(C, 2);
        Trapezoid = ((A + B) * C) / 2.0;
        Square = Math.pow(B, 2);
        Rectangle = A * B;

        System.out.printf("\nTriangle: %.3f\n", Triangle);
        System.out.printf("Circle: %.3f\n", Circle);
        System.out.printf("Trapezoid: %.3f\n", Trapezoid);
        System.out.printf("Square: %.3f\n", Square);
        System.out.printf("Retangle : %.3f\n", Rectangle);



    }
}
