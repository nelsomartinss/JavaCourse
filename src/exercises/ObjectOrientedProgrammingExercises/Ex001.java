package Exercises.ObjectOrientedProgrammingExercises;
import Exercises.ObjectOrientedProgrammingExercises.Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    void main(){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        rectangle.area();
        rectangle.perimeter();
        rectangle.diagonal();

        System.out.printf(rectangle.toString());

        sc.close();
    }
}
