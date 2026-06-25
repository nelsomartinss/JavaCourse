package Lessons.ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class TernaryOperator {
    void main(){
        double price, discount, finalAmount;
        Scanner sc = new Scanner(System.in);
        Locale localeBR = Locale.of("PT", "BR");

        System.out.print("\nEnter price in R$");
        price = sc.nextDouble();

        discount = (price < 20.0) ? price * 0.1 : price * 0.05;
        finalAmount = price - discount;
        System.out.printf(localeBR, "Final amount R$%.2f\n", finalAmount);

        sc.close();
    }
}
