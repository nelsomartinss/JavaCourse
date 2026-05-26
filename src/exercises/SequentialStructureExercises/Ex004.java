package Exercises.SequentialStructureExercises;

import java.util.Scanner;

public class Ex004 {
    void main(){
        double radius, area, pi = 3.14159;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        radius = sc.nextDouble();

        area = pi * Math.pow(radius, 2);

        System.out.printf("A=%.4f\n", area);
    }
}
