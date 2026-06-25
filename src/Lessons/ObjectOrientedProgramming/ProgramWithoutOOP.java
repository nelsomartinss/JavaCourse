package Lessons.ObjectOrientedProgramming;

import java.util.Scanner;

public class ProgramWithoutOOP {
    void main(){
        double xA, xB, xC, yA, yB, yC, p, areaX, areaY;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.print("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        p = (xA + xB + xC) / 2;
        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("\nArea of triangle X: %.4f\n", areaX);
        System.out.printf("znArea of triangle Y: %.4f\n", areaY);

        if (areaX > areaY){
            System.out.println("\nLarger area: X\n");
        } else {
            System.out.println("\nLarger area: Y\n");
        }

        sc.close();
    }
}
