package Lessons.ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class CumulativeAssignmentOperators {
    void main(){
        int numberOfMinutes;
        double amountToPay;
        Scanner sc = new Scanner(System.in);
        Locale localeBR = Locale.of("PT", "BR");

        System.out.print("\nEnter number of minutes: ");
        numberOfMinutes = sc.nextInt();

        amountToPay = 50.0;
        if (numberOfMinutes > 100){
            amountToPay += (numberOfMinutes - 100) * 2.0; // Cumulative Assignment Operator
        }

        System.out.printf(localeBR, "Amount to pay: R$%.2f\n", amountToPay);
        sc.close();
    }
}
