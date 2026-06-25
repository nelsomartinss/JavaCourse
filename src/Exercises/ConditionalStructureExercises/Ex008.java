package Exercises.ConditionalStructureExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
    void main(){
        Locale localeBR = Locale.of("PT", "BR");
        double salary, incomeTax;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        salary = sc.nextDouble();

        if (salary <= 2000.00){
            incomeTax = 0.0;
        } else if (salary <= 3000.00){
            incomeTax = (salary - 2000) * 0.08;
        } else if (salary <= 4500.00){
            incomeTax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
        // Java needs the else to have a structural guarantee/know that variable's value will be assigned
        } else {
            incomeTax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (incomeTax == 0.0){
            System.out.println("Exempt");
        } else {
            System.out.printf(localeBR, "R$ %.2f", incomeTax);
        }

        sc.close();
    }
}
