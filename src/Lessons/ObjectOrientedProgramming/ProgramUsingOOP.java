package Lessons.ObjectOrientedProgramming;
import Lessons.ObjectOrientedProgramming.Entities.Triangle; // importing the entity
import java.util.Scanner;

public class ProgramUsingOOP {
    void main(){
        Scanner sc = new Scanner(System.in);
        double p, areaX, areaY;

        Triangle x, y; // triangle-type variables

        // instantiating
        x = new Triangle();
        y = new Triangle();

        System.out.print("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); // storing a value in attribute "a" of object "x"
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.print("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble(); // storing a value in attribute "a" of object "y"
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        areaX = x.area(); // calling a method "area" from object x and y
        areaY = y.area();

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
