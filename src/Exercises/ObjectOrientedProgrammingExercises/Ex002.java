package Exercises.ObjectOrientedProgrammingExercises;

import Exercises.ObjectOrientedProgrammingExercises.Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    void main(){
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        double percentage;

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("\nEmployee " + employee + "\n");

        System.out.print("Enter the percentage to increase salary: ");
        percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.print("\nUpdated data: " + employee + "\n");

        sc.close();
    }
}
