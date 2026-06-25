package Exercises.ConditionalStructureExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
    void main(){
        int id, quantity;
        double total = 0;
        Locale localeBR = Locale.of("PT", "BR");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        if (id == 1){
            total = quantity * 4.00;
        } else if (id == 2){
            total = quantity * 4.50;
        }  else if (id == 3){
            total = quantity * 5.00;
        } else if (id == 4){
            total = quantity * 2.00;
        } else if (id == 5){
            total = quantity * 1.50;
        } else {
            System.out.println("Invalid ID");
        }

        System.out.printf(localeBR, "\nTotal: R$%.2f\n", total);
        sc.close();
    }
}
