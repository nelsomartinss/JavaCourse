package Lessons.ObjectOrientedProgramming;

import Lessons.ObjectOrientedProgramming.Util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class StaticMembersExample3 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double radius, circumference, volume;

        System.out.print("\nEnter radius: ");
        radius = sc.nextDouble();

        // With static methods, it is not necessary to instantiate an object to perform their operations
        circumference = Calculator.circumference(radius);
        volume = Calculator.volume(radius);

        System.out.printf("\nCircumference: %.2f\nVolume: %.2f\nPI: %.2f\n", circumference, volume, Calculator.PI);

        sc.close();
    }

}
