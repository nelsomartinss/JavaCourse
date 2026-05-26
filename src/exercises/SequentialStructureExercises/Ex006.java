package Exercises.SequentialStructureExercises;

import java.util.Scanner;

public class Ex006 {
    void main(){
        int employeeId;
        double hoursWorked, hourlyRate, salary;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter employee ID: ");
        employeeId = sc.nextInt();
        System.out.print("Enter hours worked: ");
        hoursWorked = sc.nextDouble();
        System.out.print("Enter hourly rate: ");
        hourlyRate = sc.nextDouble();

        salary = hoursWorked * hourlyRate;

        System.out.printf("\nNumber: %d\n", employeeId);
        System.out.printf("Salary: U$ %.2f\n", salary);

    }
}
