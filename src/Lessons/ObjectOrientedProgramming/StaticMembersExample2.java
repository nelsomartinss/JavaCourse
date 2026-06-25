package Lessons.ObjectOrientedProgramming;

import Lessons.ObjectOrientedProgramming.Util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class StaticMembersExample2 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // since none of the class members are static, we are required to instantiate the object.
        Calculator calculator = new Calculator();
        double radius, circumference, volume;

        System.out.print("\nEnter radius: ");
        radius = sc.nextDouble();

        circumference = calculator.circumference(radius);
        volume = calculator.volume(radius);

        System.out.printf("\nCircumference: %.2f\nVolume: %.2f\nPI: %.2f\n", circumference, volume, calculator.PI);

        sc.close();
    }

}
