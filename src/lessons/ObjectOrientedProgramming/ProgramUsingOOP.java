package Lessons.ObjectOrientedProgramming;
import Lessons.ObjectOrientedProgramming.Entities.Triangle; // importing the entity
import java.util.Scanner;

public class ProgramUsingOOP {
    void main(){
        Scanner sc = new Scanner(System.in);
        double p, areaX, areaY;
        Triangle x, y; // triangle-type variables
        x = new Triangle();
        y = new Triangle(); // instantiating

        System.out.print("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); // storing a value in attribute "a" of object "x"
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.print("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble(); // storing a value in attribute "a" of object "y"
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        p = (x.a + x.b + x.c) / 2;
        areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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
