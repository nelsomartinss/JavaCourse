package Lessons.ObjectOrientedProgramming;

import java.util.Locale;
import java.util.Scanner;

public class StaticMembersExample1 {

    // Constant
    public static final double PI = 3.14159; // static member

    // The main method is static by default
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double radius, circumference, volume;

        System.out.print("\nEnter radius: ");
        radius = sc.nextDouble();

        circumference = circumference(radius);
        volume = volume(radius);

        System.out.printf("\nCircumference: %.2f\nVolume: %.2f\nPI: %.2f\n", circumference, volume, PI);

        sc.close();
    }

    // All methods used are static
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3 ;
    }
}
